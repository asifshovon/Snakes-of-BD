package com.example.snakeofbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


public class BookMark extends Fragment {

    private TextView yourname,phoneno,emailadd,location;
    private Button profilebtn,update;
    Button uploadbtn;
    private CircleImageView profileImage;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    StorageReference storageReference;
    String userId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_book_mark, container, false);


        phoneno=view.findViewById(R.id.phoneno);
        yourname=view.findViewById(R.id.yourname);
        emailadd=view.findViewById(R.id.emailadd);
        location=view.findViewById(R.id.location);
        profileImage=view.findViewById(R.id.profileImage);

        profilebtn=view.findViewById(R.id.profilebtn);
        update=view.findViewById(R.id.update);

        //uploadbtn=findViewById(R.id.uploadbtn);

        fAuth= FirebaseAuth.getInstance();
        fStore= FirebaseFirestore.getInstance();
        userId=fAuth.getCurrentUser().getUid();
        storageReference= FirebaseStorage.getInstance().getReference();

        StorageReference profileRef=storageReference.child("users/"+fAuth.getCurrentUser().getUid()+"/profile.jpg");

        profileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                //Glide.with(getApplicationContext()).load(uri).into(profileImage);
                Picasso.get().load(uri).into(profileImage);
            }
        });

        DocumentReference documentReference=fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {
                phoneno.setText(documentSnapshot.getString("phone"));
                yourname.setText(documentSnapshot.getString("firstname"));
                location.setText(documentSnapshot.getString("location"));
                emailadd.setText(documentSnapshot.getString("email"));
            }
        });

        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getContext(),ProfileUpdate.class);
                startActivity(i);
            }
        });





        return view;
    }


}