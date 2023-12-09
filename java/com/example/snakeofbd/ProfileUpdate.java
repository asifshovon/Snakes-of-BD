package com.example.snakeofbd;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileUpdate extends AppCompatActivity {

    private EditText yourname,phoneno,location;
    private EditText emailadd;
    private Button uploadbtn,savebtn;

    private CircleImageView profileImage;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    StorageReference storageReference;
    String userID,userId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_update);


        yourname=findViewById(R.id.yourname);
        phoneno=findViewById(R.id.phoneno);
        location=findViewById(R.id.location);
        uploadbtn=findViewById(R.id.uploadbtn);
        savebtn=findViewById(R.id.savebtn);
        emailadd=findViewById(R.id.emailadd);

        profileImage=findViewById(R.id.profileImage);

        fAuth= FirebaseAuth.getInstance();
        fStore= FirebaseFirestore.getInstance();
        userId=fAuth.getCurrentUser().getUid();
        storageReference= FirebaseStorage.getInstance().getReference();

        StorageReference profileRef=storageReference.child("users/"+fAuth.getCurrentUser().getUid()+"/profile.jpg");
        profileRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
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

        uploadbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent openGalleryIntent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(openGalleryIntent,1000);
            }
        });



        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=yourname.getText().toString().trim();
                String phn=phoneno.getText().toString().trim();
                String loc=location.getText().toString().trim();
                String eml=emailadd.getText().toString().trim();

                if(TextUtils.isEmpty(name))
                {
                    yourname.setError("Name is Required");
                    return;
                }
                if(TextUtils.isEmpty(eml))
                {
                    emailadd.setError("Email is Required");
                    return;
                }



                if(TextUtils.isEmpty(phn))
                {
                    phoneno.setError("Phone No is Required");
                    return;
                }

                if(phn.length()<11)
                {
                    phoneno.setError("Number should be 11 character");
                    return;
                }

                if(TextUtils.isEmpty(loc))
                {
                    location.setError("Location No is Required");
                    return;
                }


                userID=fAuth.getCurrentUser().getUid();
                DocumentReference documentReference=fStore.collection("users").document(userID);
                documentReference.update("firstname",name);
                documentReference.update("email",eml);
                documentReference.update("phone",phn);
                documentReference.update("location",loc);

                /*documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Toast.makeText(getApplicationContext(),"Profile Updated",Toast.LENGTH_SHORT).show();

                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull @NotNull Exception e) {
                        Toast.makeText(getApplicationContext(),"Update failed",Toast.LENGTH_SHORT).show();
                    }

                });

                 */






                Toast.makeText(getApplicationContext(),"Profile has been updated",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),SeePost.class);
                startActivity(i);
            }
        });

    }

    protected void onActivityResult(int requestCode,int resultCode,@androidx.annotation.Nullable Intent data)
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




}