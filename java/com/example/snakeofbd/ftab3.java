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
 * Use the {@link ftab3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ftab3 extends Fragment {
    private ImageView n0,n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20,n21,n22,n23,n24,n25;
    View v;
    String t="3";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ftab3() {
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
    public static ftab3 newInstance(String param1, String param2) {
        ftab3 fragment = new ftab3();
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
        v= inflater.inflate(R.layout.fragment_ftab3, container, false);



        n0 = v.findViewById(R.id.n0);
        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="0";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n1 = v.findViewById(R.id.n1);
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="1";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });
        n2 = v.findViewById(R.id.n2);
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="2";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n3 = v.findViewById(R.id.n3);
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="3";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n4 = v.findViewById(R.id.n4);
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="4";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n5 = v.findViewById(R.id.n5);
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="5";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n6 = v.findViewById(R.id.n6);
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="6";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n7 = v.findViewById(R.id.n7);
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="7";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n8 = v.findViewById(R.id.n8);
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="8";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n9 = v.findViewById(R.id.n9);
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="9";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n10 = v.findViewById(R.id.n10);
        n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="10";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n11 = v.findViewById(R.id.n11);
        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="11";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n12 = v.findViewById(R.id.n12);
        n12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="12";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n13 = v.findViewById(R.id.n13);
        n13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="13";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n14 = v.findViewById(R.id.n14);
        n14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="14";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n15 = v.findViewById(R.id.n15);
        n15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="15";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n16 = v.findViewById(R.id.n16);
        n16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="16";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n17 = v.findViewById(R.id.n17);
        n17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="17";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n18 = v.findViewById(R.id.n18);
        n18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="18";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n19 = v.findViewById(R.id.n19);
        n19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="19";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n20 = v.findViewById(R.id.n20);
        n20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="20";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n21 = v.findViewById(R.id.n21);
        n21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="21";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n22 = v.findViewById(R.id.n22);
        n22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="22";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n23 = v.findViewById(R.id.n23);
        n23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="23";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });
        n24 = v.findViewById(R.id.n24);
        n24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="24";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });

        n25 = v.findViewById(R.id.n25);
        n25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SnakeDetails.class);
                String s="25";
                intent.putExtra("getID",s);
                intent.putExtra("getType",t);
                startActivity(intent);
            }
        });







        return v;

    }


}