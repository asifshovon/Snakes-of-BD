package com.example.snakeofbd;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AllPost extends Fragment {

    private ListView listView;
    DatabaseReference databaseReference;

    private List<AllPostClass> studentList;
    private CustomAdapter customAdapter;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all_post, container, false);


        databaseReference=FirebaseDatabase.getInstance().getReference("AllPost");

        studentList=new ArrayList<>();

        customAdapter=new CustomAdapter(getActivity(),studentList);

        listView=view.findViewById(R.id.listViewId);

        return view;
    }

    public void onStart() {

        super.onStart();


        databaseReference.orderByChild("timeStamp").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {


                studentList.clear();

                for(DataSnapshot dataSnapshot1 : snapshot.getChildren())
                {
                    AllPostClass allPostClass=dataSnapshot1.getValue(AllPostClass.class);
                    studentList.add(allPostClass);
                }
                listView.setAdapter(customAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }



}






/*
    RecyclerView myrecyclerView;
    PostDataModelAdapter postDataModelAdapter;


    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
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
        View view = inflater.inflate(R.layout.fragment_all_post, container, false);
        myrecyclerView = (RecyclerView) view.findViewById(R.id.post_rv);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setReverseLayout(true);
        mLayoutManager.setStackFromEnd(true);
        myrecyclerView.setLayoutManager(mLayoutManager);


        FirebaseRecyclerOptions<ModelPost> options =
                new FirebaseRecyclerOptions.Builder<ModelPost>()
                        .setQuery(FirebaseDatabase.getInstance().getReference("Post Added"), ModelPost.class)
                        .build();

        //Log.d("TAG", "onCreateView: "+options.toString());

        postDataModelAdapter = new PostDataModelAdapter(options);
        myrecyclerView.setAdapter(postDataModelAdapter);
        //postDataModelAdapter.startListening();

        return view;
    }


    @Override
    public void onStart() {
        super.onStart();
        postDataModelAdapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        postDataModelAdapter.stopListening();
    }
}

*/