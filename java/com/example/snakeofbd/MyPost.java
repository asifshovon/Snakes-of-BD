package com.example.snakeofbd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class MyPost extends Fragment {


    private ListView listView;
    DatabaseReference databaseReference;

    String userId;

    FirebaseAuth fAuth;

    private List<MyPostClass> studentList;
    private CustomAdapterMyPost customAdapter;



    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_post, container, false);

        fAuth= FirebaseAuth.getInstance();
        userId=fAuth.getCurrentUser().getUid();


        databaseReference= FirebaseDatabase.getInstance().getReference("MyPosts").child(userId);

        studentList=new ArrayList<>();

        customAdapter=new CustomAdapterMyPost(getActivity(),studentList);

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
                    MyPostClass allPostClass=dataSnapshot1.getValue(MyPostClass.class);
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



