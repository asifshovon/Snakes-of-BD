package com.example.snakeofbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    //Variables
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;
    TextView textView;
    private ImageView snakeButton,antiButton,hospitalButton,resButton,bittenButton,sympButton,mediaButton,lensButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.view);

        ImageView snakeButton=(ImageView)findViewById(R.id.snakeButton);
        ImageView antiButton=(ImageView)findViewById(R.id.antiButton);
        ImageView hospitalButton=(ImageView)findViewById(R.id.hospitalButton);
        ImageView resButton=(ImageView)findViewById(R.id.resButton);
        ImageView sympButton=(ImageView)findViewById(R.id.sympButton);
        ImageView bittenButton=(ImageView)findViewById(R.id.bittenButton);
        ImageView mediaButton=(ImageView)findViewById(R.id.mediaButton);
        ImageView lensButton=(ImageView)findViewById(R.id.lensButton);

        ///
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");
        ///


        snakeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent snake=new Intent(MainActivity.this,SnakesofBD.class);
                startActivity(snake);
            }
        });

        antiButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anti=new Intent(MainActivity.this,Venoms.class);
                startActivity(anti);
            }
        });
        hospitalButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hos=new Intent(MainActivity.this,Hospital.class);
                startActivity(hos);
            }
        });
        resButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent res=new Intent(MainActivity.this,Rescuers.class);
                startActivity(res);
            }
        });
        sympButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent symp=new Intent(MainActivity.this,Identify.class);
                startActivity(symp);
            }
        });
        bittenButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bit=new Intent(MainActivity.this,Bittenby.class);
                startActivity(bit);
            }
        });
        mediaButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent media=new Intent(MainActivity.this,Media.class);
                startActivity(media);
            }
        });
        lensButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.google.com/imghp?hl=en");
            }
        });






        //textView=findViewById(R.id.textView);
        //toolbar=findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.home);


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
                    break;
                case R.id.snake_icon:
                    Intent intent1 = new Intent(MainActivity.this, SnakesofBD.class);
                    startActivity(intent1);
                    break;
                case R.id.antivenoms:
                    Intent intent2 = new Intent(MainActivity.this, Venoms.class);
                    startActivity(intent2);
                    break;
                case R.id.hospital:
                    Intent intent3 = new Intent(MainActivity.this, Hospital.class);
                    startActivity(intent3);
                    break;
                case R.id.rescuer:
                    Intent intent4 = new Intent(MainActivity.this, Rescuers.class);
                    startActivity(intent4);
                    break;
                case R.id.bitten:
                    Intent intent5 = new Intent(MainActivity.this, Bittenby.class);
                    startActivity(intent5);
                    break;
                case R.id.symptoms:
                    Intent intent6 = new Intent(MainActivity.this, Identify.class);
                    startActivity(intent6);
                    break;
                case R.id.media:
                    Intent intent7 = new Intent(MainActivity.this, Media.class);
                    startActivity(intent7);
                    break;
                case R.id.lens:
                    gotoUrl("https://www.google.com/imghp?hl=en");
                    break;
                case R.id.login:
                    startActivity(new Intent(MainActivity.this,Media.class));
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