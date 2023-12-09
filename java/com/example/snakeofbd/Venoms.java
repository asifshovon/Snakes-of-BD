package com.example.snakeofbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Venoms extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;

    CardView venomIcon,antiIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venoms);

        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.view);



        venomIcon=(CardView)findViewById(R.id.venomIcon);
        venomIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Venoms.this,VenomDetails.class);
                startActivity(intent1);

            }
        });


        antiIcon=(CardView)findViewById(R.id.antiIcon);
        antiIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Venoms.this,AntiDetails.class);
                startActivity(intent2);
            }
        });





        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.antivenoms);


    }

    private void gotoUrl(String s) {

        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        {
            switch (menuItem.getItemId()) {
                case R.id.home:
                    Intent intent0 = new Intent(Venoms.this, MainActivity.class);
                    startActivity(intent0);
                    break;
                case R.id.snake_icon:
                    Intent intent1 = new Intent(Venoms.this, SnakesofBD.class);
                    startActivity(intent1);
                    break;
                case R.id.antivenoms:
                    break;
                case R.id.hospital:
                    Intent intent3 = new Intent(Venoms.this, Hospital.class);
                    startActivity(intent3);
                    break;
                case R.id.rescuer:
                    Intent intent4 = new Intent(Venoms.this, Rescuers.class);
                    startActivity(intent4);
                    break;
                case R.id.bitten:
                    Intent intent5 = new Intent(Venoms.this, Bittenby.class);
                    startActivity(intent5);
                    break;
                case R.id.symptoms:
                    Intent intent6 = new Intent(Venoms.this, Identify.class);
                    startActivity(intent6);
                    break;
                case R.id.media:
                    Intent intent7 = new Intent(Venoms.this, Media.class);
                    startActivity(intent7);
                    break;
                case R.id.lens:
                    gotoUrl("https://www.google.com/imghp?hl=en");
                    break;
                case R.id.login:
                    startActivity(new Intent(Venoms.this,Media.class));
                    finish();
                    break;
                case R.id.share:
                    Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                    break;
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }
    }

    public void onBackPressed()
    {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }
}