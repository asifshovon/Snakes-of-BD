package com.example.snakeofbd;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class RescueAdapter extends ArrayAdapter<RescuePerson> {


private Context mcontext;


private int mresource;

public RescueAdapter(@NonNull Context context,int resource,@NonNull List<RescuePerson> objects){
        super(context,resource,objects);
        this.mcontext=context;
        this.mresource=resource;


        }


@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){

        LayoutInflater layoutInflater=LayoutInflater.from(getContext());
        convertView=layoutInflater.inflate(mresource,parent,false);

        ImageView imageView1=convertView.findViewById(R.id.imageView1);
        TextView textView1=convertView.findViewById(R.id.textView1);
        TextView textView2=convertView.findViewById(R.id.textView2);
        TextView textView3=convertView.findViewById(R.id.textView3);
        TextView textView4=convertView.findViewById(R.id.textView4);

        imageView1.setImageResource(getItem(position).getImageView1());
        textView1.setText(getItem(position).getTextView1());
        textView2.setText(getItem(position).getTextView2());
        textView3.setText(getItem(position).getTextView3());
        textView4.setText(getItem(position).getTextView4());


        return convertView;

        }
        }
