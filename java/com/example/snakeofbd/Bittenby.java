package com.example.snakeofbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Bittenby extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;

    private ImageView shouldview,notview;
    private TextView textView,textView2,textView3;
    private CardView shouldcard,notcard;


    String highlights="1. If you see a snake in your home, immediately call the animal control agency in your county.\n" +
            "2. Be aware of snakes that may be swimming in the water or hiding under debris or other objects.\n" +
            "3. If you or someone you know are bitten, try to see and remember the color and shape of the snake.\n" +
            "4. Do not pick up a snake or try to trap it";

    String prevent="1. Be aware of snakes that may be swimming in the water to get to higher ground and those that may be hiding under debris or other objects.\n" +
            "2. If you see a snake, back away from it slowly and do not touch it.\n\n";

    String signs="1. A pair of puncture marks at the wound\n" +
            "2. Redness and swelling around the bite\n" +
            "3. Severe pain at the site of the bite\n" +
            "4. Nausea and vomiting\n" +
            "5. Labored breathing (in extreme cases, breathing may stop altogether)\n" +
            "6. Disturbed vision\n" +
            "7. Increased salivation and sweating\n" +
            "8. Numbness or tingling around your face and/or limbs\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bittenby);
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.view);
        shouldview=(ImageView)findViewById(R.id.shouldview);
        notview=(ImageView)findViewById(R.id.notview);


        textView=findViewById(R.id.textView);
        textView.setText(highlights);
        textView2=findViewById(R.id.textView2);
        textView2.setText(prevent);
        textView3=findViewById(R.id.textView3);
        textView3.setText(signs);


        shouldcard=(CardView)findViewById(R.id.shouldcard);
        notcard=(CardView)findViewById(R.id.notcard);
        shouldcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Bittenby.this,ShouldDo.class);
                startActivity(i);
            }
        });
        notcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Bittenby.this,NotDo.class);
                startActivity(j);
            }
        });




        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.bitten);
    }

    private void gotoUrl(String s) {

        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        {
            switch (menuItem.getItemId()) {
                case R.id.home:
                    Intent intent0 = new Intent(Bittenby.this, MainActivity.class);
                    startActivity(intent0);
                    break;
                case R.id.snake_icon:
                    Intent intent1 = new Intent(Bittenby.this, SnakesofBD.class);
                    startActivity(intent1);
                    break;
                case R.id.antivenoms:
                    Intent intent2 = new Intent(Bittenby.this, Venoms.class);
                    startActivity(intent2);
                    break;
                case R.id.hospital:
                    Intent intent3 = new Intent(Bittenby.this, Hospital.class);
                    startActivity(intent3);
                    break;
                case R.id.rescuer:
                    Intent intent4 = new Intent(Bittenby.this, Rescuers.class);
                    startActivity(intent4);
                    break;
                case R.id.bitten:
                    break;
                case R.id.symptoms:
                    Intent intent6 = new Intent(Bittenby.this, Identify.class);
                    startActivity(intent6);
                    break;
                case R.id.media:
                    Intent intent11 = new Intent(Bittenby.this, Media.class);
                    startActivity(intent11);
                    break;

                case R.id.login:
                    Intent intent10 = new Intent(Bittenby.this, Media.class);
                    startActivity(intent10);
                    break;
                case R.id.lens:
                    gotoUrl("https://www.google.com/imghp?hl=en");
                    break;

                case R.id.share:
                    Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                    break;
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }
    }
}