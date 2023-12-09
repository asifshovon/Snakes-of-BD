package com.example.snakeofbd;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.jetbrains.annotations.NotNull;

public class Media extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;

    private static String u ;

    private CheckBox mcheckBoxRemember;
    private SharedPreferences mPrefs;
    private static final String PREFS_NAME="PrefsFile";


    Button mLoginBtn;
    EditText mEmail,mPassword;
    private TextView newsign,forgottextlink;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media);


        mPrefs=getSharedPreferences(PREFS_NAME,MODE_PRIVATE);
        mcheckBoxRemember=findViewById(R.id.remember);

        drawerLayout=findViewById(R.id.drawer_layout);
        navigationView=findViewById(R.id.view);

        mEmail=findViewById(R.id.mEmail);
        mPassword=findViewById(R.id.mPassword);
        fAuth=FirebaseAuth.getInstance();
        mLoginBtn=findViewById(R.id.mLoginBtn);

        forgottextlink=findViewById(R.id.forgottextlink);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.media);

        mLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eml=mEmail.getText().toString().trim();
                String pass=mPassword.getText().toString().trim();

                if(TextUtils.isEmpty(eml))
                {
                    mEmail.setError("Email is Requiered");
                    return;
                }

                if(TextUtils.isEmpty(pass))
                {
                    mPassword.setError("Password is Requiered");
                    return;
                }
                if(pass.length()<6)
                {
                    mPassword.setError("Password is too Short");
                    return;
                }

                //new code

                if(mcheckBoxRemember.isChecked())
                {
                    Boolean boolIsChecked=mcheckBoxRemember.isChecked();
                    SharedPreferences.Editor editor=mPrefs.edit();
                    editor.putString("pref_name",mEmail.getText().toString());
                    editor.putString("pref_pass",mPassword.getText().toString());
                    editor.putBoolean("pref_check",boolIsChecked);
                    editor.apply();
                    Toast.makeText(getApplicationContext(), "User details Saved", Toast.LENGTH_SHORT).show();
                } else {
                    mPrefs.edit().clear().apply();
                }




                fAuth.signInWithEmailAndPassword(eml,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {


                            Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),SeePost.class));
                        }
                        else {
                            Toast.makeText(getApplicationContext(),"ERROR! "+task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });








            }


        }
        );


        getPreferencesData();









        newsign=findViewById(R.id.newsign);
        newsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Media.this,SignUp.class);
                startActivity(i);
            }
        });


        forgottextlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText resetMail=new EditText(v.getContext());
                final AlertDialog.Builder passwordResetDialog= new AlertDialog.Builder(v.getContext());
                passwordResetDialog.setTitle("Reset Password ?");
                passwordResetDialog.setMessage("Enter Your Email TO Received Reset Link.");
                passwordResetDialog.setView(resetMail);

                passwordResetDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String mail=resetMail.getText().toString();
                        fAuth.sendPasswordResetEmail(mail).addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void unused) {
                                Toast.makeText(Media.this,"Reset Link Sent To Your Email",Toast.LENGTH_LONG).show();

                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull @NotNull Exception e) {
                                Toast.makeText(getApplicationContext(),"ERREOR! Reset Link is Not Sent"+e.getMessage(),Toast.LENGTH_LONG).show();

                            }
                        });

                    }
                });

                passwordResetDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                    }
                });
                passwordResetDialog.create().show();
            }
        });



    }


    private void getPreferencesData() {
        String a="";
        SharedPreferences sp=getSharedPreferences(PREFS_NAME,MODE_PRIVATE);
        if(sp.contains("pref_name")){
            u=sp.getString("pref_name","not found");
            mEmail.setText(u.toString());

            //Toast.makeText(getApplicationContext(), "Email = "+u, Toast.LENGTH_SHORT).show();

        }
        if(sp.contains("pref_pass")){
            String p=sp.getString("pref_pass","not found");
            mPassword.setText(p.toString());
        }
        if(sp.contains("pref_check")){
            Boolean b=sp.getBoolean("pref_check",false);
            mcheckBoxRemember.setChecked(b);
        }
        //a=mEmail.getText().toString().trim()+mPassword.getText().toString().trim();

        //Toast.makeText(getApplicationContext(),a,Toast.LENGTH_SHORT).show();
    }


    private void gotoUrl(String s) {

        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }





    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        {
            switch (menuItem.getItemId()) {
                case R.id.home:
                    Intent intent0 = new Intent(Media.this, MainActivity.class);
                    startActivity(intent0);
                    break;
                case R.id.snake_icon:
                    Intent intent1 = new Intent(Media.this, SnakesofBD.class);
                    startActivity(intent1);
                    break;
                case R.id.antivenoms:
                    Intent intent2 = new Intent(Media.this, Venoms.class);
                    startActivity(intent2);
                    break;
                case R.id.hospital:
                    Intent intent3 = new Intent(Media.this, Hospital.class);
                    startActivity(intent3);
                    break;
                case R.id.rescuer:
                    Intent intent4 = new Intent(Media.this, Rescuers.class);
                    startActivity(intent4);
                    break;
                case R.id.bitten:
                    Intent intent7 = new Intent(Media.this, Bittenby.class);
                    startActivity(intent7);
                    break;
                case R.id.symptoms:
                    Intent intent6 = new Intent(Media.this, Identify.class);
                    startActivity(intent6);
                    break;
                case R.id.media:

                    break;
                case R.id.lens:
                    gotoUrl("https://www.google.com/imghp?hl=en");
                    break;
                case R.id.login:
                    break;
                case R.id.share:
                    Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                    break;
            }
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }
    }
}