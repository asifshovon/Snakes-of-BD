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

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ftab2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ftab2 extends Fragment {
    private ImageView m0,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20;
    View v;
    String t="2";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ftab2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ftab3.
     */
    // TODO: Rename and change types and number of parameters
    public static ftab2 newInstance(String param1, String param2) {
        ftab2 fragment = new ftab2();
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
        v= inflater.inflate(R.layout.fragment_ftab2, container, false);


        m0 = v.findViewById(R.id.m0);
        m0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="0";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m1 = v.findViewById(R.id.m1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="1";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });
        m2 = v.findViewById(R.id.m2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="2";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m3 = v.findViewById(R.id.m3);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="3";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m4 = v.findViewById(R.id.m4);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="4";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m5 = v.findViewById(R.id.m5);
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="5";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m6 = v.findViewById(R.id.m6);
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="6";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m7 = v.findViewById(R.id.m7);
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="7";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m8 = v.findViewById(R.id.m8);
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="8";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m9 = v.findViewById(R.id.m9);
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="9";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m10 = v.findViewById(R.id.m10);
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="10";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m11 = v.findViewById(R.id.m11);
        m11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="11";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m12 = v.findViewById(R.id.m12);
        m12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="12";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m13 = v.findViewById(R.id.m13);
        m13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="13";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m14 = v.findViewById(R.id.m14);
        m14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="14";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m15 = v.findViewById(R.id.m15);
        m15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="15";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m16 = v.findViewById(R.id.m16);
        m16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="16";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m17 = v.findViewById(R.id.m17);
        m17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="17";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m18 = v.findViewById(R.id.m18);
        m18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="18";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m19 = v.findViewById(R.id.m19);
        m19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="19";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        m20 = v.findViewById(R.id.m20);
        m20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="20";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });






        return v;

    }




}