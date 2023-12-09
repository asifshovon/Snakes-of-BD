package com.example.snakeofbd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Symptoms extends AppCompatActivity {

    private Spinner spinnersign, spinnerfeeling, spinnersymp;
    private Button result;
    private TextView t1, t2,mresult;

    String check="";

    String c1,c2,c3,c4;


    ArrayAdapter<String> adapter1,adapter2;


    String[] teethMark,venomId,snakeId,test2,test3,test4;


    int number;




    String tstring, vstring, sstring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);

        spinnerfeeling = (Spinner) findViewById(R.id.spinnerfeeling);
        spinnersign = (Spinner) findViewById(R.id.spinnersign);
        spinnersymp = (Spinner) findViewById(R.id.spinnersymp);

        mresult=findViewById(R.id.mresult);

        mresult.setVisibility(View.GONE);








        teethMark = getResources().getStringArray(R.array.teeth);
        venomId = getResources().getStringArray(R.array.checkVenom);
        snakeId=getResources().getStringArray(R.array.idSnake);

       test2 = getResources().getStringArray(R.array.hemo);
       test3 = getResources().getStringArray(R.array.neuro);
       test4=getResources().getStringArray(R.array.cyto);

        result = findViewById(R.id.result);

        result.setVisibility(View.GONE);





        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);

        t1.setVisibility(View.GONE);
        t2.setVisibility(View.GONE);

        spinnersymp.setVisibility(View.GONE);
        spinnerfeeling.setVisibility(View.GONE);


        //teethMark=new ArrayList<>();
        //teethMark.add("More than 2");
        //teethMark.add("Clear 2");








        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,R.layout.sample_view,R.id.textViewsampleId,teethMark);

        spinnersign.setAdapter(adapter);






        spinnersign.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (position==0)
                {
                    t1.setVisibility(View.GONE);
                    spinnerfeeling.setVisibility(View.GONE);
                    spinnersymp.setVisibility(View.GONE);
                    t2.setVisibility(View.GONE);
                    result.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);
                }
                if (position==2)
                {
                    number=0;
                    result.setVisibility(View.VISIBLE);
                    spinnersymp.setVisibility(View.GONE);
                    t2.setVisibility(View.GONE);
                    t1.setVisibility(View.GONE);
                    spinnerfeeling.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);

                }

                if (position==1)
                {
                    t1.setVisibility(View.VISIBLE);
                    spinnerfeeling.setVisibility(View.VISIBLE);
                    adapter1=new ArrayAdapter<>(getApplicationContext(),R.layout.sample_view,R.id.textViewsampleId,venomId);
                    result.setVisibility(View.GONE);
                    spinnersymp.setVisibility(View.GONE);
                    t2.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);
                }
                spinnerfeeling.setAdapter(adapter1);




            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinnerfeeling.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if (position==0)
                {
                    spinnersymp.setVisibility(View.GONE);
                    t2.setVisibility(View.GONE);
                    result.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);
                }

                if (position==1)
                {
                    spinnersymp.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);

                    adapter2=new ArrayAdapter<>(getApplicationContext(),R.layout.sample_view,R.id.textViewsampleId,test4);
                    result.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);


                }

                if (position==2)
                {
                    spinnersymp.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);

                    adapter2=new ArrayAdapter<>(getApplicationContext(),R.layout.sample_view,R.id.textViewsampleId,test3);
                    result.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);

                }

                if (position==3)
                {
                    spinnersymp.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);

                    adapter2=new ArrayAdapter<>(getApplicationContext(),R.layout.sample_view,R.id.textViewsampleId,test2);
                    result.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);

                }

                if (position==4)
                {
                    spinnersymp.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);

                    adapter2=new ArrayAdapter<>(getApplicationContext(),R.layout.sample_view,R.id.textViewsampleId,test3);
                    result.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);

                }

                if (position==5)
                {
                    spinnersymp.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);

                    adapter2=new ArrayAdapter<>(getApplicationContext(),R.layout.sample_view,R.id.textViewsampleId,test4);
                    result.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);

                }

                if (position==6)
                {
                    spinnersymp.setVisibility(View.VISIBLE);
                    t2.setVisibility(View.VISIBLE);

                    adapter2=new ArrayAdapter<>(getApplicationContext(),R.layout.sample_view,R.id.textViewsampleId,test3);
                    result.setVisibility(View.GONE);

                    mresult.setVisibility(View.GONE);

                }

                spinnersymp.setAdapter(adapter2);


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        spinnersymp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==0)
                {
                    mresult.setVisibility(View.GONE);
                    result.setVisibility(View.GONE);
                }
                if(position==1)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }

                if(position==5)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }

                if(position==3)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==2)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==4)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==6)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==7)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==8)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==9)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==10)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==11)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==12)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }
                if(position==13)
                {
                    check=spinnersymp.getSelectedItem().toString();
                    number=1;
                    result.setVisibility(View.VISIBLE);
                    mresult.setVisibility(View.GONE);
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });






        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(number==0)
                {
                    mresult.setVisibility(View.VISIBLE);
                    //Toast.makeText(getApplicationContext(),"This is a Mild",Toast.LENGTH_SHORT).show();
                }
                else
                {
                        mresult.setVisibility(View.GONE);
                        Intent i=new Intent(Symptoms.this,SeeResult.class);
                      //  i.putExtra("val","1");
                        i.putExtra("result",check);
                        startActivity(i);


                }




            }
        });









    }
}



/*


ArrayAdapter adapter=new ArrayAdapter<>(this,R.layout.sample_view,R.id.textViewsampleId,teethMark);

        spinnersign.setAdapter(adapter);

        tnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tstring=spinnersign.getSelectedItem().toString();

                if (tstring.equals(teethMark[0]))
                {
                    sstring="";
                    vstring="";

                    Toast.makeText(getApplicationContext(),"Please Select any Sign",Toast.LENGTH_LONG).show();
                    t1.setVisibility(View.GONE);
                    t2.setVisibility(View.GONE);

                    snext.setVisibility(View.GONE);
                    fnext.setVisibility(View.GONE);

                    spinnersymp.setVisibility(View.GONE);
                    spinnerfeeling.setVisibility(View.GONE);

                    result.setVisibility(View.GONE);

                }

                else if(tstring.equals(teethMark[2]))
                {

                    t1.setVisibility(View.GONE);
                    t2.setVisibility(View.GONE);

                    snext.setVisibility(View.GONE);
                    fnext.setVisibility(View.GONE);

                    spinnersymp.setVisibility(View.GONE);
                    spinnerfeeling.setVisibility(View.GONE);

                    result.setVisibility(View.VISIBLE);

                    result.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {

                            Intent intent=new Intent(Symptoms.this,SeeResult.class);
                            intent.putExtra("getId","1");
                            startActivity(intent);

                        }
                    });
                }






                else if(tstring.equals(teethMark[1]))
                {
                    t1.setVisibility(View.VISIBLE);
                    spinnerfeeling.setVisibility(View.VISIBLE);
                    fnext.setVisibility(View.VISIBLE);

                    result.setVisibility(View.GONE);
                    t2.setVisibility(View.GONE);
                    snext.setVisibility(View.GONE);
                    spinnersymp.setVisibility(View.GONE);

                }
            }
        });


        ArrayAdapter adapter2=new ArrayAdapter<>(this,R.layout.sample_view,R.id.textViewsampleId,venomId);

        spinnerfeeling.setAdapter(adapter2);



        fnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                vstring=spinnerfeeling.getSelectedItem().toString();

                if (vstring.equals(venomId[0]))
                {
                    sstring="";
                    Toast.makeText(getApplicationContext(),"Select Any Item",Toast.LENGTH_LONG).show();
                    result.setVisibility(View.GONE);
                    t2.setVisibility(View.GONE);
                    spinnersymp.setVisibility(View.GONE);
                    snext.setVisibility(View.GONE);
                }

                else if (vstring.equals(venomId[2]))
                {

                    number="1";
                    t2.setVisibility(View.VISIBLE);
                    spinnersymp.setVisibility(View.VISIBLE);
                    snext.setVisibility(View.VISIBLE);
                    result.setVisibility(View.GONE);
                }

                else if (vstring.equals(venomId[6]))
                {

                    number="1";
                    t2.setVisibility(View.VISIBLE);
                    spinnersymp.setVisibility(View.VISIBLE);
                    snext.setVisibility(View.VISIBLE);
                    result.setVisibility(View.GONE);
                }

                else if (vstring.equals(venomId[1]))
                {

                    number="2";
                    t2.setVisibility(View.VISIBLE);
                    spinnersymp.setVisibility(View.VISIBLE);
                    snext.setVisibility(View.VISIBLE);
                    result.setVisibility(View.GONE);
                }

                else if (vstring.equals(venomId[5]))
                {

                    number="2";
                    t2.setVisibility(View.VISIBLE);
                    spinnersymp.setVisibility(View.VISIBLE);
                    snext.setVisibility(View.VISIBLE);
                    result.setVisibility(View.GONE);

                }

                else if (vstring.equals(venomId[3]))
                {

                    number="3";
                    t2.setVisibility(View.VISIBLE);
                    spinnersymp.setVisibility(View.VISIBLE);
                    snext.setVisibility(View.VISIBLE);
                    result.setVisibility(View.GONE);
                }

                else if (vstring.equals(venomId[4]))
                {

                    number="3";
                    t2.setVisibility(View.VISIBLE);
                    spinnersymp.setVisibility(View.VISIBLE);
                    snext.setVisibility(View.VISIBLE);
                    result.setVisibility(View.GONE);
                }

                Toast.makeText(getApplicationContext(),vstring,Toast.LENGTH_LONG).show();




            }
        });


        spinnerfeeling.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(adapterView.getItemAtPosition(4).equals("Nausea"))
                {
                    //snakeId.clear();
                    snakeId=getResources().getStringArray(R.array.idSnake);
                    fillSpinner();
                }


                else if(adapterView.getItemAtPosition(1).equals("Bleeding"))
                {
                    snakeId=getResources().getStringArray(R.array.test2);
                    fillSpinner1();
                }

            }
        });






        //ArrayAdapter adapter3=new ArrayAdapter<>(this,R.layout.sample_view,R.id.textViewsampleId,snakeId);
       // spinnersymp.setAdapter(adapter3);











    }


    public void fillSpinner()
    {
        ArrayAdapter adapter3=new ArrayAdapter<>(this,R.layout.sample_view,R.id.textViewsampleId,snakeId);
        spinnersymp.setAdapter(adapter3);
    }

    public void fillSpinner1()
    {
        ArrayAdapter adapter3=new ArrayAdapter<>(this,R.layout.sample_view,R.id.textViewsampleId,test2);
        spinnersymp.setAdapter(adapter3);
    }



 */