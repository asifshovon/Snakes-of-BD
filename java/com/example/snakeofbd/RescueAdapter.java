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

    public RescueAdapter(@NonNull Context context, int resource, @NonNull List<RescuePerson> objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.mresource = resource;


    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        convertView = layoutInflater.inflate(mresource, parent, false);

        ImageView imageView1 = convertView.findViewById(R.id.imageView1);
        TextView textView1 = convertView.findViewById(R.id.textView1);
        TextView textView2 = convertView.findViewById(R.id.textView2);
        TextView textView3 = convertView.findViewById(R.id.textView3);
        TextView textView4 = convertView.findViewById(R.id.textView4);

        imageView1.setImageResource(getItem(position).getImageView1());
        textView1.setText(getItem(position).getTextView1());
        textView2.setText(getItem(position).getTextView2());
        textView3.setText(getItem(position).getTextView3());
        textView4.setText(getItem(position).getTextView4());


        return convertView;

    }
}


/*
    @Override
    public Filter getFilter() {
        Filter filter = new Filter() {

            @SuppressWarnings("unchecked")
            @Override
            protected void publishResults(CharSequence constraint,FilterResults results) {

                mDisplayedValues = (ArrayList<RescuePerson>) results.values; // has the filtered values
                notifyDataSetChanged();  // notifies the data with new filtered values
            }

            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                FilterResults results = new FilterResults();        // Holds the results of a filtering operation in values
                ArrayList<RescuePerson> FilteredArrList = new ArrayList<RescuePerson>();

                if (mOriginalValues == null) {
                    mOriginalValues = new ArrayList<RescuePerson>(mDisplayedValues); // saves the original data in mOriginalValues
                }


                if (constraint == null || constraint.length() == 0) {

                    // set the Original result to return
                    results.count = mOriginalValues.size();
                    results.values = mOriginalValues;
                } else {
                    constraint = constraint.toString().toLowerCase();
                    for (int i = 0; i < mOriginalValues.size(); i++) {
                        String data = mOriginalValues.get(i).getTextView1();
                        if (data.toLowerCase().startsWith(constraint.toString())) {
                            FilteredArrList.add(new RescuePerson(mOriginalValues.get(i).getImageView1(),mOriginalValues.get(i).getTextView1(),mOriginalValues.get(i).getTextView2(),mOriginalValues.get(i).getTextView3(),mOriginalValues.get(i).getTextView4()));
                        }
                    }
                    // set the Filtered result to return
                    results.count = FilteredArrList.size();
                    results.values = FilteredArrList;
                }
                return results;
            }
        };
        return filter;
    }

 */






