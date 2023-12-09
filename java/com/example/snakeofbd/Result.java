package com.example.snakeofbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Result extends AppCompatActivity implements View.OnClickListener {
    private Button goback,result;
    private TextView yourscore,answered,correct;
    private ImageView res;

    int imagegood=R.drawable.good;
    int imagebad=R.drawable.bad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        result=findViewById(R.id.result);
        result.setOnClickListener(this);
        goback=findViewById(R.id.goback);
        goback.setOnClickListener(this);
        yourscore=findViewById(R.id.yourscore);
        answered=findViewById(R.id.answered);
        correct=findViewById(R.id.correct);
        res=(ImageView)findViewById(R.id.res);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
            {
                case R.id.result:
                    String t=getIntent().getStringExtra("score");
                    String tt=getIntent().getStringExtra("question");
                    String ttt=getIntent().getStringExtra("corr");
                    yourscore.setVisibility(View.VISIBLE);
                    correct.setVisibility(View.VISIBLE);
                    answered.setVisibility(View.VISIBLE);
                    res.setVisibility(View.VISIBLE);
                    yourscore.setText(yourscore.getText()+t);
                    answered.setText(answered.getText()+tt);
                    correct.setText(correct.getText()+ttt);
                    goback.setVisibility(View.VISIBLE);
                    result.setVisibility(View.GONE);

                    if(Integer.parseInt(t)>50)
                    {
                        res.setImageResource(R.drawable.good);

                    }
                    else
                    {
                        res.setImageResource(R.drawable.bad);
                    }
                    break;

                case R.id.goback:
                    Intent intent=new Intent(Result.this,MainActivity.class);
                    startActivity(intent);



            }




    }
}