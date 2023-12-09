package com.example.snakeofbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ToxicPop extends AppCompatActivity {

    TextView detailstype,detailstext,snakesAvailable;
    ImageView detailsImage;



    String[] type;
    {
        type=new String[]{"NeuroToxic","Cytotoxic","HemoToxic"};
    }

    String[] intro;
            {
                   intro = new String[]{"Neurotoxic venom tends to act more quickly, attacking the nervous system and stopping nerve signals getting through to the muscles.\nThis means paralysis, starting at the head, moving down the body until, if untreated, the diaphragm is paralysed and the patient can't breathe.\n A classic sign of this is ptosis, when people can't keep their eyes open.Around the area of the bite, necrosis can set in. That happens when the venom destroys nearby muscles, tissues and cells. Long-term, this can lead to amputations, the loss of the use of a limb or the need for multiple skin grafts.",
                           "Cytotoxic venom works on a molecular level by destroying the cell membrane thus destroying the tissue cell by cell.\nThe macro effect of this cell destruction and the effect we can see with the naked eye is tissue necrosis.",
                           "Haemotoxic venom goes for the bloodstream.\nIt can trigger lots of tiny blood clots and then when the venom punches holes in blood vessels causing them to leak, there is nothing left to stem the flow and the patient bleeds to death.",
                   };
            }

            int[] vImage={R.drawable.neurotoxic,R.drawable.cytotoxic,R.drawable.hemotoxic};

    String[] neurotoxicSnake;
    {
        neurotoxicSnake=new String[]{"Banded Krait","Maccleland's Coral Snake","Spectacled Cobra","Pop's Pit Viper",
                        "Sind Krait","Greater Black Krait","Lesser Black Krait","Wall's Krait","Monocled Cobra",
                        "Common Krait","Belcher's Sea Snake","Black Banded Sea Snake","Yellow Lipped Sea Krait",
                        "Red Necked Keelback","Hook Nosed Water Snake","Slender Coral Snake","Yellow Bellied Sea Snake"};
    }

    String[] hemotoxicSnake;
    {
        hemotoxicSnake=new String[]{"Russel's Viper","Mountain Pit Viper","Saw Scaled Viper (Mainly)","White Lipped Pit Viper",
                    "Green Pit Viper","Spot Tailed Pit Viper (Mainly)","Bamboo Pit Viper"};
    }

    String[] cytotoxicSnake;
    {
        cytotoxicSnake=new String[]{"King Cobra (Mainly)","Saw Scaled Viper"};
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toxic_pop);

        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width=dm.widthPixels;
        int height=dm.heightPixels;
        getWindow().setLayout((int)(width*.85),(int)(height*.85));

        detailstext=findViewById(R.id.detailstext);
        detailstype=findViewById(R.id.detailstype);
        detailsImage=(ImageView)findViewById(R.id.detailsImage);
        snakesAvailable=findViewById(R.id.snakesAvailable);




        Intent intent = getIntent();
        String s = intent.getStringExtra("getID");
        int id = Integer.parseInt(s);

        if(id==1)
        {
            String nameNeuro="";
            detailstype.setText(type[0]);
            detailstext.setText(intro[0]);
            detailsImage.setImageResource(vImage[0]);

            /*detailsImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    gotoUrl("https://www.nbcnews.com/healthmain/first-aid-snakebite-could-come-nasal-spray-researcher-says-6c10813636");
                }
            });

             */
            for (int i = 0; i<neurotoxicSnake.length; i++)
            {
                nameNeuro=snakesAvailable.getText().toString()+"\n";
                snakesAvailable.setText(nameNeuro+"# "+neurotoxicSnake[i]);
            }

        }
        else if(id==2)
        {
            String nameCyto="";
            detailstype.setText(type[1]);
            detailstext.setText(intro[1]);
            detailsImage.setImageResource(vImage[1]);
            for (int i = 0; i<cytotoxicSnake.length; i++)
            {
                nameCyto=snakesAvailable.getText().toString()+"\n";
                snakesAvailable.setText(nameCyto+"# "+cytotoxicSnake[i]);
            }
        }
        else if(id==3)
        {
            String nameHemo="";
            detailstype.setText(type[2]);
            detailstext.setText(intro[2]);
            detailsImage.setImageResource(vImage[2]);
            for (int i = 0; i<hemotoxicSnake.length; i++)
            {
                nameHemo=snakesAvailable.getText().toString()+"\n";
                snakesAvailable.setText(nameHemo+"# "+hemotoxicSnake[i]);
            }
        }


    }

    /*public void gotoUrl(String s)
    {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

     */
}