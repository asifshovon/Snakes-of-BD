package com.example.snakeofbd;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeeResult extends AppCompatActivity {
    RecyclerView rcv;
    myadapter c1,h1,n1;

    String f="";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_result);


        setTitle("Recycler and Card View Demo");

        Toast.makeText(getApplicationContext(),"Result Found",Toast.LENGTH_SHORT).show();

        rcv = (RecyclerView) findViewById(R.id.recview);
        //  rcv.setLayoutManager(new LinearLayoutManager(this));

        f=getIntent().getStringExtra("result");

        if(f.equals("Labored breathing"))
        {
            c1 = new myadapter(dataqueuec1(),getApplicationContext());
            rcv.setAdapter(c1);
        }

        else if(f.equals("Rapid heart rate, low pressure"))
        {
            c1 = new myadapter(dataqueuec2(),getApplicationContext());
            rcv.setAdapter(c1);
        }

        else if(f.equals("Severe pain and tenderness"))
        {
            c1 = new myadapter(dataqueuec2(),getApplicationContext());
            rcv.setAdapter(c1);
        }

        else if(f.equals("Swelling and pain"))
        {
            c1 = new myadapter(dataqueuec4(),getApplicationContext());
            rcv.setAdapter(c1);
        }

        else if(f.equals("Bleeding"))
        {
            h1=new myadapter(dataqueueh1(),getApplicationContext());
            rcv.setAdapter(h1);
        }
        else if(f.equals("Pressure Low"))
        {
            h1=new myadapter(dataqueueh1(),getApplicationContext());
            rcv.setAdapter(h1);
        }

        else if (f.equals("Hemorrhagic blisters"))
        {
            h1 = new myadapter(dataqueuec4(),getApplicationContext());
            rcv.setAdapter(h1);
        }
        else if (f.equals("Immediate pain"))
        {
            h1 = new myadapter(dataqueueh3(),getApplicationContext());
            rcv.setAdapter(h1);
        }
        else if (f.equals("UnOrdered heart-rate"))
        {
            h1 = new myadapter(dataqueueh3(),getApplicationContext());
            rcv.setAdapter(h1);
        }
        else if (f.equals("Incoagulable blood"))
        {
            h1=new myadapter(dataqueueh1(),getApplicationContext());
            rcv.setAdapter(h1);
        }
        else if (f.equals("Minty taste"))
        {
            h1 = new myadapter(dataqueueh5(),getApplicationContext());
            rcv.setAdapter(h1);
        }

        else if (f.equals("Spontaneous bleeding"))
        {
            h1=new myadapter(dataqueueh1(),getApplicationContext());
            rcv.setAdapter(h1);
        }

        else if (f.equals("Trouble breathing"))
        {
            h1=new myadapter(dataqueueh7(),getApplicationContext());
            rcv.setAdapter(h1);
        }

        else if (f.equals("Numbness of lips"))
        {
            n1=new myadapter(dataqueuen1(),getApplicationContext());
            rcv.setAdapter(n1);
        }
        else if (f.equals("Difficulty in breathing"))
        {
            n1=new myadapter(dataqueuen1(),getApplicationContext());
            rcv.setAdapter(n1);
        }

        else if (f.equals("Abdominal cramps"))
        {
            n1=new myadapter(dataqueuen2(),getApplicationContext());
            rcv.setAdapter(n1);
        }

        else if (f.equals("Painful muscles"))
        {
            n1=new myadapter(dataqueuen3(),getApplicationContext());
            rcv.setAdapter(n1);
        }
        else if (f.equals("Joint aches"))
        {
            n1=new myadapter(dataqueuen4(),getApplicationContext());
            rcv.setAdapter(n1);
        }
        else if (f.equals("Muscle Pain"))
        {
            n1=new myadapter(dataqueuen5(),getApplicationContext());
            rcv.setAdapter(n1);
        }
        else if (f.equals("Coagulopathy"))
        {
            n1=new myadapter(dataqueuen6(),getApplicationContext());
            rcv.setAdapter(n1);
        }
        else if (f.equals("Hypersalivation"))
        {
            n1=new myadapter(dataqueuen7(),getApplicationContext());
            rcv.setAdapter(n1);
        }
        else if (f.equals("Double vision"))
        {
            n1=new myadapter(dataqueuen8(),getApplicationContext());
            rcv.setAdapter(n1);
        }
        else if (f.equals("muscle twitching"))
        {
            n1=new myadapter(dataqueuen8(),getApplicationContext());
            rcv.setAdapter(n1);
        }
        else if (f.equals("Abdominal pain"))
        {
            n1=new myadapter(dataqueuen9(),getApplicationContext());
            rcv.setAdapter(n1);
        }

        else if (f.equals("Drowsiness"))
        {
            n1=new myadapter(dataqueuen10(),getApplicationContext());
            rcv.setAdapter(n1);
        }













        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        rcv.setLayoutManager(linearLayoutManager);
    }

    //neuro start

    public ArrayList<Model> dataqueuen9()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob2=new Model();
        ob2.setHeader("Banded Krait");
        ob2.setDesc("0");
        ob2.setImgname(R.drawable.banded_krait);
        holder.add(ob2);

        Model ob1=new Model();
        ob1.setHeader("Greater Black Krait");
        ob1.setDesc("5");
        ob1.setImgname(R.drawable.greater_krait);
        holder.add(ob1);

        Model ob5=new Model();
        ob5.setHeader("Wall's Krait");
        ob5.setDesc("6");
        ob5.setImgname(R.drawable.walls_krait);
        holder.add(ob5);

        Model ob3=new Model();
        ob3.setHeader("Common Krait");
        ob3.setDesc("8");
        ob3.setImgname(R.drawable.common_krait);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("Sind Krait");
        ob4.setDesc("11");
        ob4.setImgname(R.drawable.sind_krait);
        holder.add(ob4);

        return holder;

    }

    public ArrayList<Model> dataqueuen10()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob2=new Model();
        ob2.setHeader("Banded Krait");
        ob2.setDesc("0");
        ob2.setImgname(R.drawable.banded_krait);
        holder.add(ob2);

        Model ob1=new Model();
        ob1.setHeader("Greater Black Krait");
        ob1.setDesc("5");
        ob1.setImgname(R.drawable.greater_krait);
        holder.add(ob1);

        Model ob5=new Model();
        ob5.setHeader("Wall's Krait");
        ob5.setDesc("6");
        ob5.setImgname(R.drawable.walls_krait);
        holder.add(ob5);

        Model ob7=new Model();
        ob7.setHeader("Monocled Cobra");
        ob7.setDesc("7");
        ob7.setImgname(R.drawable.greater_krait);
        holder.add(ob7);

        Model ob3=new Model();
        ob3.setHeader("Common Krait");
        ob3.setDesc("8");
        ob3.setImgname(R.drawable.common_krait);
        holder.add(ob3);

        Model ob6=new Model();
        ob6.setHeader("Yellow Lipped Sea Snake");
        ob6.setDesc("17");
        ob6.setImgname(R.drawable.yellow_lipped_sea);
        holder.add(ob6);

        return holder;
    }



    public ArrayList<Model> dataqueuen4()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Black Banded Sea Snake");
        ob1.setDesc("16");
        ob1.setImgname(R.drawable.black_banded_sea);
        holder.add(ob1);
        return holder;
    }

    public ArrayList<Model> dataqueuen5()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Yellow Lipped Sea Snake");
        ob1.setDesc("17");
        ob1.setImgname(R.drawable.yellow_lipped_sea);
        holder.add(ob1);
        return holder;
    }

    public ArrayList<Model> dataqueuen6()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Red Necked Keelback");
        ob1.setDesc("20");
        ob1.setImgname(R.drawable.red_necked);
        holder.add(ob1);
        return holder;
    }

    public ArrayList<Model> dataqueuen7()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Hook Nosed Sea Snake");
        ob1.setDesc("23");
        ob1.setImgname(R.drawable.hook_nosed_sea);
        holder.add(ob1);
        return holder;
    }

    public ArrayList<Model> dataqueuen8()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Slender Coral Snake");
        ob1.setDesc("22");
        ob1.setImgname(R.drawable.slender_coral);
        holder.add(ob1);
        return holder;
    }

    public ArrayList<Model> dataqueuen3()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Belcher's Sea Snake");
        ob1.setDesc("15");
        ob1.setImgname(R.drawable.belchers_sea);
        holder.add(ob1);
        return holder;
    }



    public ArrayList<Model> dataqueuen2()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Lessar Black Krait");
        ob1.setDesc("3");
        ob1.setImgname(R.drawable.lesser_krait);
        holder.add(ob1);
        return holder;
    }



    public ArrayList<Model> dataqueuen1()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Mcclelland's Coral Snake");
        ob1.setDesc("12");
        ob1.setImgname(R.drawable.macclelands_coral);
        holder.add(ob1);
        return holder;
    }



    //hemo start

    public ArrayList<Model> dataqueueh7()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob2=new Model();
        ob2.setHeader("Bamboo Pit Viper");
        ob2.setDesc("21");
        ob2.setImgname(R.drawable.bamboo_pit);
        holder.add(ob2);

        Model ob1=new Model();
        ob1.setHeader("Spot Tailed Pit Viper");
        ob1.setDesc("19");
        ob1.setImgname(R.drawable.spot_tailed_pit);
        holder.add(ob1);
        return holder;
    }


    public ArrayList<Model> dataqueueh5()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Green Pit Viper");
        ob1.setDesc("18");
        ob1.setImgname(R.drawable.green_pit_viper);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("White Lipped Pit Viper");
        ob2.setDesc("4");
        ob2.setImgname(R.drawable.white_lipped_pit);
        holder.add(ob2);
        return holder;
    }

    public ArrayList<Model> dataqueueh3()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Mountain Pit Viper");
        ob1.setDesc("14");
        ob1.setImgname(R.drawable.mountain_pit);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("White Lipped Pit Viper");
        ob2.setDesc("4");
        ob2.setImgname(R.drawable.white_lipped_pit);
        holder.add(ob2);
        return holder;
    }

    public ArrayList<Model> dataqueueh1()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Russel's Viper");
        ob1.setDesc("2");
        ob1.setImgname(R.drawable.russels_viper);
        holder.add(ob1);
        return holder;
    }
    //Hemo ends




    //cyto arraylist
    public ArrayList<Model> dataqueuec4()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("Saw Scaled Viper");
        ob1.setDesc("14");
        ob1.setImgname(R.drawable.saw_scaled_viper);
        holder.add(ob1);
        return holder;
    }

    public ArrayList<Model> dataqueuec2()
    {
        ArrayList<Model> holder=new ArrayList<>();
        Model ob1=new Model();
        ob1.setHeader("King Cobra");
        ob1.setDesc("1");
        ob1.setImgname(R.drawable.king_kobra);
        holder.add(ob1);
        return holder;
    }

    public ArrayList<Model> dataqueuec1()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("King Cobra");
        ob1.setDesc("1");
        ob1.setImgname(R.drawable.king_kobra);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("Saw Scaled Viper");
        ob2.setDesc("14");
        ob2.setImgname(R.drawable.saw_scaled_viper);
        holder.add(ob2);
        return holder;
    }
    //cyto list end






}