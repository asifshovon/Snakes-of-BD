package com.example.snakeofbd;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

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

public class Profile extends AppCompatActivity {
    private TextView yourname,phoneno,emailadd,location;
    private Button profilebtn,post,update;
    Button uploadbtn;
    private CircleImageView profileImage;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    StorageReference storageReference;
    String userId;
    //final static int count=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        phoneno=findViewById(R.id.phoneno);
        yourname=findViewById(R.id.yourname);
        emailadd=findViewById(R.id.emailadd);
        location=findViewById(R.id.location);
        profileImage=findViewById(R.id.profileImage);

        profilebtn=findViewById(R.id.profilebtn);
        post=findViewById(R.id.post);
        update=findViewById(R.id.update);
        //uploadbtn=findViewById(R.id.uploadbtn);

        fAuth= FirebaseAuth.getInstance();
        fStore= FirebaseFirestore.getInstance();
        userId=fAuth.getCurrentUser().getUid();
        storageReference=FirebaseStorage.getInstance().getReference();

        StorageReference profileRef=storageReference.child("users/"+fAuth.getCurrentUser().getUid()+"/profile.jpg");

        profileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                //Glide.with(getApplicationContext()).load(uri).into(profileImage);
                Picasso.get().load(uri).into(profileImage);
            }
        });

        DocumentReference documentReference=fStore.collection("users").document(userId);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
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
                Intent i=new Intent(Profile.this,ProfileUpdate.class);
                startActivity(i);
            }
        });

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),SeePost.class);
                startActivity(i);
            }
        });


        /*uploadbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                    Intent openGalleryIntent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    startActivityForResult(openGalleryIntent,1000);
                        uploadbtn.setVisibility(View.GONE);





            }
        });

         */

    }

    /*protected void onActivityResult(int requestCode,int resultCode,@androidx.annotation.Nullable Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        if(requestCode==1000)
        {
            if(resultCode== Activity.RESULT_OK)
            {
                Uri imageUri=data.getData();
                uploadImageToFirebase(imageUri);
                //profileImage.setImageURI(imageUri);
            }
        }
    }

    private void uploadImageToFirebase(Uri imageUri) {
        StorageReference fileRef=storageReference.child("users/"+fAuth.getCurrentUser().getUid()+"/profile.jpg");
        fileRef.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                fileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {
                        Picasso.get().load(uri).into(profileImage);
                    }
                });

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull @NotNull Exception e) {
                Toast.makeText(getApplicationContext(),"Failed to Upload",Toast.LENGTH_LONG).show();
            }
        });

    }

     */


}