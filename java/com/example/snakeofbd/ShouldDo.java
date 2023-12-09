package com.example.snakeofbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class ShouldDo extends AppCompatActivity implements View.OnClickListener {
    private VideoView video1;

    TextView textView1;

    String should="1. If you or someone you know are bitten, try to see and remember the color and shape of the snake, which can help with treatment of the snake bite.\n" +
            "2. Keep the bitten person still and calm. This can slow down the spread of venom if the snake is venomous.\n" +
            "3. Seek medical attention as soon as possible.\n" +
            "4. Dial 911 or call local Emergency Medical Services (EMS).\n" +
            "5. Apply first aid if you cannot get the person to the hospital right away.\n" +
            "       5.1 Lay or sit the person down with the bite below the level of the heart.\n" +
            "       5.2 Tell him/her to stay calm and still.\n" +
            "       5.3 Wash the wound with warm soapy water immediately.\n" +
            "       5.4 Cover the bite with a clean, dry dressing.\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_should_do);

        textView1=findViewById(R.id.textView1);
        textView1.setText(should);



        video1 = (VideoView) findViewById(R.id.video1);
        video1.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.first);
        MediaController mediaController = new MediaController(this);
        video1.setMediaController(mediaController);
        mediaController.setAnchorView(video1);
        video1.start();








    }


    @Override
    public void onClick(View v) {

    }
}