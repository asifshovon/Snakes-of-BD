package com.example.snakeofbd;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class SignUp extends AppCompatActivity {
    public static final String TAG = "TAG";
    private EditText firstname,email,password,confirmpassword,phone,loc;
    private Button signup;
    private TextView already;
    private ProgressBar progressBar;
    String userID;
    FirebaseFirestore fStore;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firstname=findViewById(R.id.firstname);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        confirmpassword=findViewById(R.id.confirmpassword);
        phone=findViewById(R.id.phone);
        signup=findViewById(R.id.signup);
        loc=findViewById(R.id.loc);

        fAuth=FirebaseAuth.getInstance();
        fStore=FirebaseFirestore.getInstance();
        progressBar=findViewById(R.id.progressBar);

        already=findViewById(R.id.already);
        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Media.class));
                finish();
            }
        });

        /*if(fAuth.getCurrentUser()!=null)
        {
            startActivity(new Intent(getApplicationContext(),Media.class));
            finish();
        }*/



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eml=email.getText().toString().trim();
                String name=firstname.getText().toString().trim();
                String pass=password.getText().toString().trim();
                String phn=phone.getText().toString().trim();
                String conpass=confirmpassword.getText().toString().trim();
                String location=loc.getText().toString().trim();


                if(TextUtils.isEmpty(name))
                {
                    firstname.setError("Name is Required");
                    return;
                }

                if(TextUtils.isEmpty(eml))
                {
                    email.setError("Email is Required");
                    return;
                }

                if(TextUtils.isEmpty(pass))
                {
                    password.setError("Password is Required");
                    return;
                }
                if(!conpass.equals(pass))
                {
                    confirmpassword.setError("Password Didn't match");
                    return;
                }
                if(pass.length()<6)
                {
                    password.setError("Password is too Short");
                    return;
                }

                if(TextUtils.isEmpty(phn))
                {
                    phone.setError("Phone No is Required");
                    return;
                }

                if((phn.length()<11)|(phn.length()>11))
                {
                    phone.setError("Number should be 11 character");
                    return;
                }

                if(TextUtils.isEmpty(location))
                {
                    loc.setError("Location is Required");
                    return;
                }







                progressBar.setVisibility(View.VISIBLE);

                //register the user in firebase

                fAuth.createUserWithEmailAndPassword(eml,pass).addOnCompleteListener((task) ->  {
                        if(task.isSuccessful())
                        {

                            Toast.makeText(getApplicationContext(),"USER CREATED",Toast.LENGTH_LONG).show();


                            ///store data in fire store



                            userID=fAuth.getCurrentUser().getUid();
                            DocumentReference documentReference=fStore.collection("users").document(userID);
                            Map<String,Object> user=new HashMap<>();
                            user.put("firstname",name);
                            user.put("email",eml);
                            user.put("phone",phn);
                            user.put("location",location);

                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    Toast.makeText(getApplicationContext(),"User has been created",Toast.LENGTH_SHORT).show();

                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull @NotNull Exception e) {
                                    Log.d(TAG,"onFailure: "+e.toString());
                                }

                            });




                            /*
                            FirebaseUser fuser=fAuth.getCurrentUser();


                            fuser.sendEmailVerification().addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void aVoid) {
                                    Toast.makeText(getApplicationContext(),"Verification Email has been Sent",Toast.LENGTH_LONG).show();
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                                @Override
                                public void onFailure(@NonNull @NotNull Exception e) {
                                    Log.d(TAG,"onFailure: Email Not sent"+e.getMessage());                               }
                            });

                             */






                            startActivity(new Intent(getApplicationContext(),SeePost.class));
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"ERROR! "+task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }


                });

        }



});
}
}