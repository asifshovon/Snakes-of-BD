package com.example.snakeofbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Rescuers extends AppCompatActivity {



    RescueAdapter rescueAdapter;




    ArrayList<RescuePerson> persons;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_rescuers);


        initData();

        ListView listView = findViewById(R.id.lvProducts);





        rescueAdapter = new RescueAdapter(Rescuers.this, R.layout.item_design, persons);

        listView.setAdapter(rescueAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {




                RescuePerson r = (RescuePerson) parent.getItemAtPosition(position);
                String num = r.getTextView4();

                //Toast.makeText(getApplicationContext(),"Item selected"+num,Toast.LENGTH_LONG).show();


                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:" + num));
                startActivity(i);



            }




        });



        rescueAdapter.notifyDataSetChanged();


    }

    private void initData() {


        persons = new ArrayList<>();


        persons.add(new RescuePerson(R.drawable.nes, "Emergency Number", "BANGLADESH", "999.gov.bd@gmail.com", "999"));
        persons.add(new RescuePerson(R.drawable.rupom, "Rupom Biswas", "Bagerhat", "rupom@gmail.com", "01517327318"));
        persons.add(new RescuePerson(R.drawable.rana, "Juwel Rana", "Brahman Baria", "rana@gmail.com", "01624782425"));
        persons.add(new RescuePerson(R.drawable.sifat, "Sifat Hasan", "Comilla", "sifat@gmail.com", "01685222049"));
        persons.add(new RescuePerson(R.drawable.shafkat, "Muhtasir Shafkat", "Comilla", "shafkat@gmail.com", "01957830750"));
        persons.add(new RescuePerson(R.drawable.asif, "Asif Iqbal", "Dhaka", "asif.iqbal.cse@ulab.edu.bd", "01685740131"));
        persons.add(new RescuePerson(R.drawable.joy, "Hridul Joy", "Faridpur", "joy@gmail.com", "01874417083"));
        persons.add(new RescuePerson(R.drawable.anik, "Anik Paul", "Jessore", "anik@gmail.com", "01963188529"));
        persons.add(new RescuePerson(R.drawable.opu, "Ataur Rahman", "Munshiganj", "opu@gmail.com", "01930277115"));
        persons.add(new RescuePerson(R.drawable.dip, "Dip Ashik", "Pabna", "dip@gmail.com", "01622505807"));
        persons.add(new RescuePerson(R.drawable.rahim, "Rahim Islam", "Shoriatpur", "rahim@gmail.com", "01684525518"));
        persons.add(new RescuePerson(R.drawable.talha, "Talha Jubayer", "Sherpur", "talha@gmail.com", "01521431105"));
        persons.add(new RescuePerson(R.drawable.raihan, "Md Raihan", "Swandip", "raihan@gmail.com", "01874517426"));





  }

}






