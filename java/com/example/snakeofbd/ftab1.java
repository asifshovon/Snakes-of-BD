package com.example.snakeofbd;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import org.jetbrains.annotations.NotNull;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ftab1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ftab1 extends Fragment {
    private ImageView b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
    String t="1";



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ftab1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ftab1.
     */
    // TODO: Rename and change types and number of parameters
    public static ftab1 newInstance(String param1, String param2) {
        ftab1 fragment = new ftab1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v = inflater.inflate(R.layout.fragment_ftab1, container, false);

        b1 = v.findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="0";
                intent.putExtra("getType",t);
                intent.putExtra("getID",s);
                startActivity(intent);
            }
        });

        b2 = v.findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="1";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b3 = v.findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="2";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b4 = v.findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="3";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b5 = v.findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="4";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b6 = v.findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="5";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b7 = v.findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="6";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b8 = v.findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="7";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b9 = v.findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="8";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b10 = v.findViewById(R.id.b10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="9";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b11 = v.findViewById(R.id.b11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="10";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b12 = v.findViewById(R.id.b12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="11";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b13 = v.findViewById(R.id.b13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="12";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b14 = v.findViewById(R.id.b14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="13";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b15 = v.findViewById(R.id.b15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="14";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b16 = v.findViewById(R.id.b16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="15";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b17 = v.findViewById(R.id.b17);
        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="16";
                intent.putExtra("getID",s);

                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b18 = v.findViewById(R.id.b18);
        b18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="17";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b19 = v.findViewById(R.id.b19);
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="18";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b20 = v.findViewById(R.id.b20);
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="19";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b21 = v.findViewById(R.id.b21);
        b21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="20";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b22 = v.findViewById(R.id.b22);
        b22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="21";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        b23 = v.findViewById(R.id.b23);
        b23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="22";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });
        b24 = v.findViewById(R.id.b24);
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="23";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });






        return v;

    }

}