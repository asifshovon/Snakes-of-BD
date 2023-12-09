package com.example.snakeofbd;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class AddPost extends Fragment {
    EditText addpost,contact,location;
    TextView username,useremail;
    ImageView imageView;
    Button addbtn;
    String post,cont,loc,uname,uemail,time,postdate,userid;


    FirebaseFirestore fStore;

    Long timeStamp;

    String isRes="1";



    FirebaseAuth fAuth;
    String userId;


    StorageReference storageReference;

    DatabaseReference addpostreference;




    public AddPost() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_add_post, container, false);

        addpost=v.findViewById(R.id.addpost);
        location=v.findViewById(R.id.location);
        contact=v.findViewById(R.id.contact);
        addbtn=v.findViewById(R.id.addbtn);
        imageView=v.findViewById(R.id.imageView);
        username=v.findViewById(R.id.username);
        useremail=v.findViewById(R.id.useremail);



        fStore= FirebaseFirestore.getInstance();

        fAuth= FirebaseAuth.getInstance();
        userId=fAuth.getCurrentUser().getUid();
        storageReference= FirebaseStorage.getInstance().getReference();

        StorageReference profileRef=storageReference.child("users/"+fAuth.getCurrentUser().getUid()+"/profile.jpg");

        profileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Picasso.get().load(uri).into(imageView);
            }
        });

        DocumentReference documentReference=fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                username.setText(documentSnapshot.getString("firstname"));
                useremail.setText(documentSnapshot.getString("email"));
                contact.setText(documentSnapshot.getString("phone"));
                location.setText(documentSnapshot.getString("location"));


            }
        });








        //1
        addpostreference= FirebaseDatabase.getInstance().getReference().child("AllPost");


        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar c = Calendar.getInstance();

                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH) + 1;
                int day = c.get(Calendar.DAY_OF_MONTH);

                int hour = c.get(Calendar.HOUR);
                int minute = c.get(Calendar.MINUTE);
                int sec = c.get(Calendar.SECOND);

                postdate=day+"/"+month+"/"+year;



                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a");
                time = simpleDateFormat.format(c.getTime());

                userid=userId;




                //Toast.makeText(getContext(),userid,Toast.LENGTH_SHORT).show();



                uname=username.getText().toString();
                uemail=useremail.getText().toString();
                post=addpost.getText().toString();
                cont=contact.getText().toString();
                loc=location.getText().toString();

                timeStamp = System.currentTimeMillis()/1000-System.currentTimeMillis()/900;


                if(TextUtils.isEmpty(post))
                {
                    addpost.setError("Post is Empty");
                    return;
                }

                if(TextUtils.isEmpty(cont))
                {
                    contact.setError("Contact is Empty");
                    return;
                }

                if(TextUtils.isEmpty(loc))
                {
                    location.setError("Location is Empty");
                    return;
                }

                if(cont.length()!=11)
                {
                    contact.setError("Badly Formatted");
                    return;
                }







                insertPost();

                Toast.makeText(getContext(),cont,Toast.LENGTH_SHORT).show();

                addpost.getText().clear();

                

            }
        });





        return v;
    }

    private void insertPost()
    {
        //PostClass postdetails=new PostClass(uname,uemail,post,cont,loc,postdate,time,userid,timeStamp);


        DatabaseReference catchpost=addpostreference.push() ;

        PostClass postdetails=new PostClass(uname,uemail,post,cont,loc,postdate,time,userid,timeStamp,isRes, catchpost.getKey());

        catchpost.setValue(postdetails);


        DatabaseReference mypostref = FirebaseDatabase.getInstance().getReference("MyPosts");
        DatabaseReference myokpostref = mypostref.child(userid);
        myokpostref.child(catchpost.getKey()).setValue(postdetails);

    }


}