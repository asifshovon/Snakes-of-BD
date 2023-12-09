package com.example.snakeofbd;

import android.Manifest;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class Hospital extends AppCompatActivity {

    FusedLocationProviderClient fusedLocationProviderClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);
        //init loc
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this);

        getloc();
    }

    public boolean contains( String haystack, String needle ) {
        haystack = haystack == null ? "" : haystack;
        needle = needle == null ? "" : needle;

        // Works, but is not the best.
        //return haystack.toLowerCase().indexOf( needle.toLowerCase() ) > -1

        return haystack.toLowerCase().contains( needle.toLowerCase() );
    }

    String numsstr="{\n" +
            "  \"numbers\": [\n" +
            "    {\n" +
            "      \"id\":\"395781\",\n" +
            "      \"number\":\"01712274765\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"748604\",\n" +
            "      \"number\":\"01719691088\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"762080\",\n" +
            "      \"number\":\"999\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"581125\",\n" +
            "      \"number\":\"999\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"838449\",\n" +
            "      \"number\":\"01752620845\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"838440\",\n" +
            "      \"number\":\"01712274765\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"837211\",\n" +
            "      \"number\":\"0255001910\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"837200\",\n" +
            "      \"number\":\"01708527752\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"840697\",\n" +
            "      \"number\":\"01819285874\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"840018\",\n" +
            "      \"number\":\"01708411481\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"837157\",\n" +
            "      \"number\":\"01911725007\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"417403\",\n" +
            "      \"number\":\"01731666555\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"395771\",\n" +
            "      \"number\":\"01715604224\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"417398\",\n" +
            "      \"number\":\":01726868420\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"417392\",\n" +
            "      \"number\":\"01612442244\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"416962\",\n" +
            "      \"number\":\":01793557825\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"417384\",\n" +
            "      \"number\":\"01819476612\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"448000\",\n" +
            "      \"number\":\"01716545663\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"446649\",\n" +
            "      \"number\":\"01726395992\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"498483\",\n" +
            "      \"number\":\"01918433219\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"975303\",\n" +
            "      \"number\":\"01785906593\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"820402\",\n" +
            "      \"number\":\"01911226444\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"498477\",\n" +
            "      \"number\":\"01777903601\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"824719\",\n" +
            "      \"number\":\"01783664400\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"820376\",\n" +
            "      \"number\":\"01792222016\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"823316\",\n" +
            "      \"number\":\"01718267442\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"820349\",\n" +
            "      \"number\":\"01865656575\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"823324\",\n" +
            "      \"number\":\"01711855400\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"820326\",\n" +
            "      \"number\":\"01916741877\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\":\"625250\",\n" +
            "      \"number\":\"01819745266\"\n" +
            "    }\n" +
            "  ]\n" +
            "}";

    public void httpCall(String url) {

        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject obj = new JSONObject(response);
                            JSONArray item = obj.getJSONArray("places");
                            for (int i = 0; i < item.length(); i++) {
                                JSONObject jsn=item.getJSONObject((i));
                                LinearLayout hspcon = (LinearLayout) findViewById(R.id.hsppnl);

                                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                                        LinearLayout.LayoutParams.WRAP_CONTENT,
                                        LinearLayout.LayoutParams.WRAP_CONTENT
                                );
                                params.setMargins(40, 50, 0, 0);


                                LinearLayout box=new LinearLayout(Hospital.this);

                                TextView txt = new TextView(Hospital.this);
                                txt.setHeight(50);
                                txt.setHeight(100);
                                txt.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
                                txt.setText(jsn.getString("name"));
                                txt.setLayoutParams(params);
                                box.addView(txt);

                                if (contains(numsstr,jsn.getString("id"))){
                                    JSONObject numsobj = new JSONObject(numsstr);
                                    JSONArray nums = numsobj.getJSONArray("numbers");
                                    for (int ii = 0; ii < nums.length(); ii++) {
                                        JSONObject n=nums.getJSONObject(ii);
                                        if (n.getString("id").equals(jsn.getString("id"))){

                                            String cursnum=n.getString(("number"));

                                            Button btn = new Button(Hospital.this);
                                            btn.setHeight(50);
                                            btn.setText("Call");
                                            btn.setLayoutParams(params);
                                            btn.setOnClickListener(new View.OnClickListener(){
                                                @Override
                                                public void onClick(View arg0) {
                                                    try {
                                                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                                        callIntent.setData(Uri.parse("tel:"+cursnum));
                                                        startActivity(callIntent);
                                                    } catch (ActivityNotFoundException activityException) {
                                                    }
                                                }

                                            });
                                            box.addView(btn);
                                        }
                                    }
                                }

                                hspcon.addView(box);
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // enjoy your error status
            }
        });

        queue.add(stringRequest);
    }

    private void getloc() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        fusedLocationProviderClient.getLastLocation().addOnCompleteListener(new OnCompleteListener<Location>() {
            @Override
            public void onComplete(@NonNull Task<Location> task) {
                Location loc=task.getResult();
                if (loc!=null){
                    try {
                        Geocoder gc=new Geocoder(Hospital.this,
                                Locale.getDefault());

                        List<Address> addresses=gc.getFromLocation(
                                loc.getLatitude(),loc.getLongitude(),1
                        );
                        TextView curinfotxt= (TextView)findViewById(R.id.infotxtcurloc);
                        curinfotxt.setText(addresses.get(0).getAddressLine(0));

                        Log.d("loc", loc.getLongitude()+" :: "+loc.getLatitude());


                        httpCall("https://barikoi.xyz/v2/api/search/nearby/category/MjQ0NTpPUVMzQ01VUlVK/1/10?longitude="+loc.getLongitude()+"&distance=20&latitude="+loc.getLatitude()+"&ptype=Healthcare");

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}