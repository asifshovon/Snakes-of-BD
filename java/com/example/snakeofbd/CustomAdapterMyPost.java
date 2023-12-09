package com.example.snakeofbd;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.List;

public class CustomAdapterMyPost extends ArrayAdapter<MyPostClass> {

    private Activity context;
    private List<MyPostClass> studentlist;

    String key;
    View back;
    String checkres;


    DatabaseReference databaseReference,allpostdatabasereference;

    DatabaseReference changeRes,allpostchange;


    StorageReference storageReference;

    public CustomAdapterMyPost( Activity context, List<MyPostClass> studentlist) {
        super(context, R.layout.list_item1, studentlist);
        this.context = context;
        this.studentlist = studentlist;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater=context.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.list_item1,null,true);

        View root;

        MyPostClass allPostClass=studentlist.get(position);

        TextView username,uemail,userlocation,date,time,contact,text,usid,dltpost,check,resbtn;
        ImageView profileImage;
        LinearLayout allcolor;

        username=view.findViewById(R.id.username);
        uemail=view.findViewById(R.id.uemail);
        userlocation=view.findViewById(R.id.userlocation);
        date=view.findViewById(R.id.date);
        time=view.findViewById(R.id.time);
        contact=view.findViewById(R.id.contact);
        text=view.findViewById(R.id.text);
        usid=view.findViewById(R.id.usid);
        profileImage=view.findViewById(R.id.profileImage);
        dltpost=view.findViewById(R.id.dltpost);
        check=view.findViewById(R.id.check);
        resbtn=view.findViewById(R.id.resbtn);

        allcolor=view.findViewById(R.id.allcolor);





        username.setText("Name : "+ allPostClass.getUname());
        uemail.setText(allPostClass.getUemail());
        userlocation.setText("Location : "+ allPostClass.getLoc());
        date.setText(allPostClass.getPostdate());
        time.setText(allPostClass.getTime());
        contact.setText(allPostClass.getCont());
        text.setText(allPostClass.getPost());
        usid.setText(allPostClass.getUserid());
        check.setText(allPostClass.getIsRes());






        final String IDUSER;
        IDUSER=usid.getText().toString();


        checkres=check.getText().toString();

        if(checkres.equals("2"))
        {
            allcolor.setBackgroundResource(R.color.bground);
            uemail.setTextColor(Color.parseColor("#000000"));
            contact.setTextColor(Color.parseColor("#000000"));
            username.setTextColor(Color.parseColor("#000000"));
            userlocation.setTextColor(Color.parseColor("#000000"));
            time.setTextColor(Color.parseColor("#000000"));
            date.setTextColor(Color.parseColor("#000000"));
        }







        allpostdatabasereference=FirebaseDatabase.getInstance().getReference("AllPost");

        databaseReference=FirebaseDatabase.getInstance().getReference("MyPosts");

        storageReference= FirebaseStorage.getInstance().getReference();

        StorageReference profileRef=storageReference.child("users/"+usid.getText().toString()+"/profile.jpg");

        profileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(profileImage);
            }
        });

        dltpost.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {



                key = allPostClass.getPostKey();
                Toast.makeText(getContext(), key+"", Toast.LENGTH_SHORT).show();
                DatabaseReference mypostdelete=databaseReference.child(IDUSER).child(key);
                DatabaseReference allpostdelete=allpostdatabasereference.child(key);
                mypostdelete.removeValue();
                allpostdelete.removeValue();


            }
        });

        resbtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                changeRes=FirebaseDatabase.getInstance().getReference("MyPosts").child(usid.getText().toString()).child(allPostClass.getPostKey());

                allpostchange=FirebaseDatabase.getInstance().getReference("AllPost").child(allPostClass.getPostKey());


                HashMap hashMap=new HashMap();
                hashMap.put("isRes","2");


                allpostchange.updateChildren(hashMap).addOnSuccessListener(new OnSuccessListener() {
                    @Override
                    public void onSuccess(Object o) {


                    }
                });

                changeRes.updateChildren(hashMap).addOnSuccessListener(new OnSuccessListener() {
                    @Override
                    public void onSuccess(Object o) {

                    }
                });




               //checkres="2";
               /*
                if(checkres.equals("2"))
                {
                    allcolor.setBackgroundResource(R.color.red);
                    uemail.setTextColor(Color.parseColor("#FFFFFF"));
                    contact.setTextColor(Color.parseColor("#FFFFFF"));
                    username.setTextColor(Color.parseColor("#FFFFFF"));
                    userlocation.setTextColor(Color.parseColor("#FFFFFF"));
                    time.setTextColor(Color.parseColor("#FFFFFF"));
                    date.setTextColor(Color.parseColor("#FFFFFF"));


                }
                else
                {

                }

                */


            }
        });














        return view;
    }
}
