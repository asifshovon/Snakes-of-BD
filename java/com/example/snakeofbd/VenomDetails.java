package com.example.snakeofbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class VenomDetails extends AppCompatActivity implements View.OnClickListener {
    VideoView video1;

    TextView neuro,cyto,hemo;
    String s="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venom_details);
        neuro=findViewById(R.id.neuro);
        cyto=findViewById(R.id.cyto);
        hemo=findViewById(R.id.hemo);
        neuro.setOnClickListener(this);
        cyto.setOnClickListener(this);
        hemo.setOnClickListener(this);


        video1 = (VideoView) findViewById(R.id.video1);
        video1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.effect);
        MediaController mediaController = new MediaController(this);
        video1.setMediaController(mediaController);
        mediaController.setAnchorView(video1);
        video1.start();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.neuro:

                Intent i1=new Intent(VenomDetails.this,ToxicPop.class);
                s="1";
                i1.putExtra("getID",s);
                startActivity(i1);
                break;

            case R.id.cyto:
                Intent i2=new Intent(VenomDetails.this,ToxicPop.class);
                s="2";
                i2.putExtra("getID",s);
                startActivity(i2);
                break;
            case R.id.hemo:
                Intent i3=new Intent(VenomDetails.this,ToxicPop.class);
                s="3";
                i3.putExtra("getID",s);
                startActivity(i3);
                break;


        }



    }
}