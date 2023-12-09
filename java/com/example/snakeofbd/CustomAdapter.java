package com.example.snakeofbd;

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

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<AllPostClass> {

    private Activity context;
    private List<AllPostClass> studentlist;

    String checkres;


    StorageReference storageReference;

    public CustomAdapter( Activity context, List<AllPostClass> studentlist) {
        super(context, R.layout.list_item, studentlist);
        this.context = context;
        this.studentlist = studentlist;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView,ViewGroup parent) {

        LayoutInflater layoutInflater=context.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.list_item,null,true);

        AllPostClass allPostClass=studentlist.get(position);

        TextView username,uemail,userlocation,date,time,contact,text,usid,check;
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

        check=view.findViewById(R.id.check);

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





        storageReference= FirebaseStorage.getInstance().getReference();

        StorageReference profileRef=storageReference.child("users/"+usid.getText().toString()+"/profile.jpg");

        profileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(profileImage);
            }
        });








        return view;
    }
}
