package com.example.snakeofbd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Identify extends AppCompatActivity implements View.OnClickListener {

    private Button next,submit,getStarted,idsymp;
    private ImageView imageView;
    private TextView question, score, count;
    private TextView button1, button2, button3, button4;

    int i = 0, randomquestion, value1;
    int scor=0,total=0,cor=0;
    int random ;
    int j = 0;
    int c = 0;
    String correct = "";
    int value4,value2,value3;

    String[] SnakeName;

    {
        SnakeName = new String[]{"Banded Krait", "King Cobra", "Russel's Viper", "Lesser Black Krait", "White Lipped Pit Viper", "Greater Black Krait",
                "Wall's Krait", "Monocled Cobra", "Common Krait", "Spectacled Cobra", "Popes Pit Viper", "Sind Krait",
                "Macceleland's Coral Snake", "Mountain Pit Viper", "Saw Scaled Viper", "Belcher's Sea Snake", "Black Banded Sea Snake",
                "Yellow Lipped Sea Snake", "Green Pit Viper", "Spot Tailed Pit Viper", "Red Necked Keelback", "Bamboo Pit Viper",
                "Slender Coral Snake", "Hook Nosed Sea Snake",
                "Arrowback Tree Snake","Asian Vine Snake","Brown Speckled","Common Cat Snake",
                "Common Mock Viper","Common Vine Snake","Green Cat Snake","Dog Tooth Cat Snake",
                "Dussumieri Water Snake","Glossy Marsh Water Snake","Puff Faced Water Snake",
                "Dog Faced Water Snake","Many Spotted Cat Snake","Siebolds Water Snake",
                "Rainbow Water Snake","White Bellied Mangrove Snake","Tawny Cat Snake",
                "Westermanns Snake","Mock Viper","Golden Flying Snake","Smooth Scaled Water Snake",
                "Ashy Kukri Snake","Banded Racer","Buff Striped Keelback","Burmese Rock Python","Calamaria Reed Snake",
                "Checkered Keelback","Common Bronzeback Tree","Common Slug Eater","Copper Headed Trinket",
                "Green Rat Snake","Indian Rat Snake","Indian Wolf Snake","Painted Bronzeback Tree",
                "Marine File Snake","Olive Keelback","Indo-Chinese Rat Snake","Painted Keelback",
                "Reticulate Python","Rock Python","Russel's Sand Boa","Trinket Snake","Twin Spotted Wolf",
                "Wall's Keelback","White Banded Wolf","White Barred Kukri","Red Coral Kukri"};
    }

    int[] images = {R.drawable.banded_krait, R.drawable.king_kobra, R.drawable.russels_viper, R.drawable.lesser_krait, R.drawable.white_lipped_pit, R.drawable.greater_krait
            , R.drawable.walls_krait, R.drawable.monocled, R.drawable.common_krait, R.drawable.spectacled, R.drawable.pope_pit, R.drawable.sind_krait
            , R.drawable.macclelands_coral, R.drawable.mountain_pit, R.drawable.saw_scaled_viper, R.drawable.belchers_sea, R.drawable.black_banded_sea
            , R.drawable.yellow_lipped_sea, R.drawable.green_pit_viper, R.drawable.spot_tailed_pit, R.drawable.red_necked, R.drawable.bamboo_pit
            , R.drawable.slender_coral, R.drawable.hook_nosed_sea,
            R.drawable.arrow_back_tree,R.drawable.asian_vine,R.drawable.brown_speckled,R.drawable.common_cat,
            R.drawable.common_mock_viper,R.drawable.common_vine,R.drawable.green_cat,R.drawable.dogtooth_cat,
            R.drawable.dussumieri_water,R.drawable.glossy_marsh,R.drawable.puff_faced_water,
            R.drawable.dog_faced_water,R.drawable.many_spotted_cat,R.drawable.siebolds_water,
            R.drawable.rainbow_water,R.drawable.white_bellied_mangrove,R.drawable.tawny_cat,
            R.drawable.westermanns,R.drawable.mock_viper,R.drawable.golden_flying,R.drawable.smooth_scaled,
            R.drawable.ashy_kukri,R.drawable.banded_racer,R.drawable.buff_striped,R.drawable.burmese_rock,R.drawable.calamaria_reed,
            R.drawable.checkered_keelback,R.drawable.common_bronzeback,R.drawable.common_slug_eater,R.drawable.copperhead_trinket,
            R.drawable.green_rat_snake,R.drawable.indian_rat_snake,R.drawable.indian_wolf,R.drawable.painted_bronzeback_tree,
            R.drawable.marine_file,R.drawable.olive_keelback,R.drawable.indo_chinese_rat,R.drawable.painted_keelback,
            R.drawable.reticulate_python,R.drawable.rock_python,R.drawable.sand_boa,R.drawable.trinket_snake,R.drawable.twin_spotted_wolf,
            R.drawable.walls_keelback,R.drawable.white_banded_wolf,R.drawable.white_barred_kukri,R.drawable.red_coral_kukri};


    String[] Question;

    {
        Question = new String[]{"What is the name of the Snake ?"};
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identify);
        next = findViewById(R.id.next);
        next.setOnClickListener(this);
        submit=findViewById(R.id.submit);
        submit.setOnClickListener(this);
        question = findViewById(R.id.question);
        score = findViewById(R.id.score);
        count = findViewById(R.id.count);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        imageView = (ImageView) findViewById(R.id.imageView);

        idsymp=findViewById(R.id.idsymp);
        idsymp.setOnClickListener(this);

        idsymp.setVisibility(View.VISIBLE);


        getStarted=findViewById(R.id.getStarted);
        getStarted.setOnClickListener(this);

        next.setVisibility(View.GONE);
        submit.setVisibility(View.GONE);
        score.setVisibility(View.GONE);
        count.setVisibility(View.GONE);



        }



    @Override
    public void onClick(View v) {
        switch (v.getId())
        {

            case R.id.getStarted:

                idsymp.setVisibility(View.GONE);

                getStarted.setVisibility(View.GONE);
                question.setVisibility(View.VISIBLE);
                button1.setVisibility(View.VISIBLE);
                button2.setVisibility(View.VISIBLE);
                button3.setVisibility(View.VISIBLE);
                button4.setVisibility(View.VISIBLE);
                score.setVisibility(View.VISIBLE);
                count.setVisibility(View.VISIBLE);
                score.setText("Score : "+scor);
                total++;
                count.setText("Question :"+total+"/10");

                Random objGenerator = new Random();
                    random = objGenerator.nextInt(70);
                    randomquestion = 0;
                    value1 = new Random().nextInt(3);
                    question.setText(Question[randomquestion]);
                    imageView.setImageResource(images[random]);
                    correct = SnakeName[random];
                    if (value1 == 0) {
                        button1.setText("1." + correct);
                        button1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // set the color to relative layout
                                button1.setBackgroundResource(R.color.green);
                                button2.setClickable(false);
                                button3.setClickable(false);
                                button4.setClickable(false);
                                scor=scor+10;
                                score.setText("Score : "+scor);
                                cor++;

                            }
                        });


                        value2 = new Random().nextInt(70);
                        if(value2==value1)
                        {
                            value2 = new Random().nextInt(70);
                        }
                        else
                        {
                            button2.setText("2." + SnakeName[value2]);
                            button2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button1.setBackgroundResource(R.color.green);
                                    button2.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button4.setClickable(false);

                                }
                            });

                        }



                        value3 = new Random().nextInt(70);
                        if((value3==value2)||(value3==value1))
                        {
                            value3 = new Random().nextInt(70);
                        }
                        else
                        {
                            button3.setText("3." + SnakeName[value3]);
                            button3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button1.setBackgroundResource(R.color.green);
                                    button3.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button2.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });

                        }



                        value4 = new Random().nextInt(70);
                        if((value4==value1)||(value4==value2)||(value4==value3))
                        {
                            value4 = new Random().nextInt(70);
                        }
                        else
                        {
                            button4.setText("4." + SnakeName[value4]);
                            button4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button1.setBackgroundResource(R.color.green);
                                    button4.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                }
                            });
                        }


                    }
                    else if (value1 == 1) {
                        button2.setText("2." + correct);
                        button2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // set the color to relative layout
                                button2.setBackgroundResource(R.color.green);
                                button1.setClickable(false);
                                button3.setClickable(false);
                                button4.setClickable(false);
                                scor=scor+10;
                                score.setText("Score : "+scor);
                                cor++;
                            }
                        });


                        value2 = new Random().nextInt(70);
                        if(value2==value1)
                        {
                            value2 = new Random().nextInt(70);
                        }
                        else
                        {
                        button1.setText("1." + SnakeName[value2]);
                        button1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // set the color to relative layout
                                button2.setBackgroundResource(R.color.green);
                                button1.setBackgroundResource(R.color.red);
                                button2.setClickable(false);
                                button3.setClickable(false);
                                button4.setClickable(false);
                            }
                        });
                        }


                        value3 = new Random().nextInt(70);
                        if((value3==value2)||(value3==value1))
                        {
                            value3 = new Random().nextInt(70);
                        }
                        else {
                            button3.setText("3." + SnakeName[value3]);
                            button3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button2.setBackgroundResource(R.color.green);
                                    button3.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button2.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value4 = new Random().nextInt(70);
                        if((value4==value1)||(value4==value2)||(value4==value3))
                        {
                            value4 = new Random().nextInt(70);
                        }
                        else {
                            button4.setText("4." + SnakeName[value4]);
                            button4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button2.setBackgroundResource(R.color.green);
                                    button4.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                }
                            });
                        }

                    }
                    else if (value1 == 2) {
                        button3.setText("3." + correct);
                        button3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // set the color to relative layout
                                button3.setBackgroundResource(R.color.green);
                                scor=scor+10;
                                score.setText("Score : "+scor);
                                cor++;
                                button2.setClickable(false);
                                button1.setClickable(false);
                                button4.setClickable(false);
                            }
                        });


                        value2 = new Random().nextInt(70);
                        if(value2==value1)
                        {
                            value2 = new Random().nextInt(70);
                        }
                        else {
                            button2.setText("2." + SnakeName[value2]);
                            button2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button3.setBackgroundResource(R.color.green);
                                    button2.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value3 = new Random().nextInt(70);
                        if((value3==value2)||(value3==value1))
                        {
                            value3 = new Random().nextInt(70);
                        }
                        else {
                            button1.setText("1." + SnakeName[value3]);
                            button1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button3.setBackgroundResource(R.color.green);
                                    button1.setBackgroundResource(R.color.red);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value4 = new Random().nextInt(70);
                        if((value4==value1)||(value4==value2)||(value4==value3))
                        {
                            value4 = new Random().nextInt(70);
                        }
                        else {
                            button4.setText("4." + SnakeName[value4]);
                            button4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button3.setBackgroundResource(R.color.green);
                                    button4.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                }
                            });
                        }

                    }
                    else if (value1 == 3) {
                        button4.setText("4." + correct);
                        button4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // set the color to relative layout
                                button4.setBackgroundResource(R.color.green);
                                scor=scor+10;
                                score.setText("Score : "+scor);
                                cor++;
                                button2.setClickable(false);
                                button3.setClickable(false);
                                button1.setClickable(false);
                            }
                        });


                        value2 = new Random().nextInt(70);
                        if(value2==value1)
                        {
                            value2 = new Random().nextInt(70);
                        }
                        else {
                            button2.setText("2." + SnakeName[value2]);
                            button2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button4.setBackgroundResource(R.color.green);
                                    button2.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value3 = new Random().nextInt(70);
                        if((value3==value2)||(value3==value1))
                        {
                            value3 = new Random().nextInt(70);
                        }
                        else {
                            button3.setText("3." + SnakeName[value3]);
                            button3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button4.setBackgroundResource(R.color.green);
                                    button3.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button2.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                            value4 = new Random().nextInt(70);
                        if((value4==value1)||(value4==value2)||(value4==value3))
                        {
                            value4 = new Random().nextInt(70);
                        }
                        else {
                            button1.setText("1." + SnakeName[value4]);
                            button1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button4.setBackgroundResource(R.color.green);
                                    button1.setBackgroundResource(R.color.red);
                                    button4.setClickable(false);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                }
                            });
                        }


                    }


                    button1.setBackgroundResource(R.color.white);
                    button2.setBackgroundResource(R.color.white);
                    button3.setBackgroundResource(R.color.white);
                    button4.setBackgroundResource(R.color.white);

                    button1.setClickable(true);
                    button2.setClickable(true);
                    button3.setClickable(true);
                    button4.setClickable(true);

                    c++;


                next.setVisibility(View.VISIBLE);
                submit.setVisibility(View.VISIBLE);
                break;


            case R.id.idsymp:
            {
                Intent intent=new Intent(Identify.this,Symptoms.class);
                startActivity(intent);
                break;
            }




            case R.id.next:
                if (c==10)
                {
                    Intent intent=new Intent(Identify.this,Result.class);
                    startActivity(intent);
                }
                else {
                    total++;
                    count.setText("Question :"+total+"/10");
                    objGenerator = new Random();
                    random = objGenerator.nextInt(70);
                    randomquestion = 0;
                    value1 = new Random().nextInt(3);
                    question.setText(Question[randomquestion]);
                    imageView.setImageResource(images[random]);
                    correct = SnakeName[random];
                    if (value1 == 0) {
                        button1.setText("1." + correct);
                        button1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // set the color to relative layout
                                button1.setBackgroundResource(R.color.green);
                                button2.setClickable(false);
                                button3.setClickable(false);
                                button4.setClickable(false);
                                scor=scor+10;
                                score.setText("Score : "+scor);
                                cor++;

                            }
                        });


                        value2 = new Random().nextInt(70);
                        if(value2==value1)
                        {
                            value2 = new Random().nextInt(70);
                        }
                        else
                        {
                            button2.setText("2." + SnakeName[value2]);
                            button2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button1.setBackgroundResource(R.color.green);
                                    button2.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button4.setClickable(false);

                                }
                            });

                        }



                        value3 = new Random().nextInt(70);
                        if((value3==value2)||(value3==value1))
                        {
                            value3 = new Random().nextInt(70);
                        }
                        else
                        {
                            button3.setText("3." + SnakeName[value3]);
                            button3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button1.setBackgroundResource(R.color.green);
                                    button3.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button2.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });

                        }



                        value4 = new Random().nextInt(70);
                        if((value4==value1)||(value4==value2)||(value4==value3))
                        {
                            value4 = new Random().nextInt(70);
                        }
                        else
                        {
                            button4.setText("4." + SnakeName[value4]);
                            button4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button1.setBackgroundResource(R.color.green);
                                    button4.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                }
                            });
                        }


                    }
                    else if (value1 == 1) {
                        button2.setText("2." + correct);
                        button2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // set the color to relative layout
                                button2.setBackgroundResource(R.color.green);
                                button1.setClickable(false);
                                button3.setClickable(false);
                                button4.setClickable(false);
                                scor=scor+10;
                                score.setText("Score : "+scor);
                                cor++;
                            }
                        });


                        value2 = new Random().nextInt(70);
                        if(value2==value1)
                        {
                            value2 = new Random().nextInt(70);
                        }
                        else
                        {
                            button1.setText("1." + SnakeName[value2]);
                            button1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button2.setBackgroundResource(R.color.green);
                                    button1.setBackgroundResource(R.color.red);
                                    button2.setClickable(false);
                                    button3.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value3 = new Random().nextInt(70);
                        if((value3==value2)||(value3==value1))
                        {
                            value3 = new Random().nextInt(70);
                        }
                        else {
                            button3.setText("3." + SnakeName[value3]);
                            button3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button2.setBackgroundResource(R.color.green);
                                    button3.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button2.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value4 = new Random().nextInt(70);
                        if((value4==value1)||(value4==value2)||(value4==value3))
                        {
                            value4 = new Random().nextInt(70);
                        }
                        else {
                            button4.setText("4." + SnakeName[value4]);
                            button4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button2.setBackgroundResource(R.color.green);
                                    button4.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                }
                            });
                        }

                    }
                    else if (value1 == 2) {
                        button3.setText("3." + correct);
                        button3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // set the color to relative layout
                                button3.setBackgroundResource(R.color.green);
                                scor=scor+10;
                                score.setText("Score : "+scor);
                                cor++;
                                button2.setClickable(false);
                                button1.setClickable(false);
                                button4.setClickable(false);
                            }
                        });


                        value2 = new Random().nextInt(70);
                        if(value2==value1)
                        {
                            value2 = new Random().nextInt(70);
                        }
                        else {
                            button2.setText("2." + SnakeName[value2]);
                            button2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button3.setBackgroundResource(R.color.green);
                                    button2.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value3 = new Random().nextInt(70);
                        if((value3==value2)||(value3==value1))
                        {
                            value3 = new Random().nextInt(70);
                        }
                        else {
                            button1.setText("1." + SnakeName[value3]);
                            button1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button3.setBackgroundResource(R.color.green);
                                    button1.setBackgroundResource(R.color.red);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value4 = new Random().nextInt(70);
                        if((value4==value1)||(value4==value2)||(value4==value3))
                        {
                            value4 = new Random().nextInt(70);
                        }
                        else {
                            button4.setText("4." + SnakeName[value4]);
                            button4.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button3.setBackgroundResource(R.color.green);
                                    button4.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                }
                            });
                        }

                    }
                    else if (value1 == 3) {
                        button4.setText("4." + correct);
                        button4.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                // set the color to relative layout
                                button4.setBackgroundResource(R.color.green);
                                scor=scor+10;
                                score.setText("Score : "+scor);
                                cor++;
                                button2.setClickable(false);
                                button3.setClickable(false);
                                button1.setClickable(false);
                            }
                        });


                        value2 = new Random().nextInt(70);
                        if(value2==value1)
                        {
                            value2 = new Random().nextInt(70);
                        }
                        else {
                            button2.setText("2." + SnakeName[value2]);
                            button2.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button4.setBackgroundResource(R.color.green);
                                    button2.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button3.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value3 = new Random().nextInt(70);
                        if((value3==value2)||(value3==value1))
                        {
                            value3 = new Random().nextInt(70);
                        }
                        else {
                            button3.setText("3." + SnakeName[value3]);
                            button3.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button4.setBackgroundResource(R.color.green);
                                    button3.setBackgroundResource(R.color.red);
                                    button1.setClickable(false);
                                    button2.setClickable(false);
                                    button4.setClickable(false);
                                }
                            });
                        }


                        value4 = new Random().nextInt(70);
                        if((value4==value1)||(value4==value2)||(value4==value3))
                        {
                            value4 = new Random().nextInt(70);
                        }
                        else {
                            button1.setText("1." + SnakeName[value4]);
                            button1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View view) {
                                    // set the color to relative layout
                                    button4.setBackgroundResource(R.color.green);
                                    button1.setBackgroundResource(R.color.red);
                                    button4.setClickable(false);
                                    button3.setClickable(false);
                                    button2.setClickable(false);
                                }
                            });
                        }


                    }


                    button1.setBackgroundResource(R.color.white);
                    button2.setBackgroundResource(R.color.white);
                    button3.setBackgroundResource(R.color.white);
                    button4.setBackgroundResource(R.color.white);

                    button1.setClickable(true);
                    button2.setClickable(true);
                    button3.setClickable(true);
                    button4.setClickable(true);

                    c++;


                    next.setVisibility(View.VISIBLE);
                    submit.setVisibility(View.VISIBLE);
                    break;
                }




            case R.id.submit:
                Intent intent=new Intent(Identify.this,Result.class);
                String s=String.valueOf(scor);
                intent.putExtra("score",s);
                String q=String.valueOf(total);
                intent.putExtra("question",q);
                String co=String.valueOf(cor);
                intent.putExtra("corr",co);
                startActivity(intent);
                break;

        }





        }



}

