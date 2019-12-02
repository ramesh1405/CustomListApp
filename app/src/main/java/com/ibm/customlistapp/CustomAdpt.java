package com.ibm.customlistapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
class CustomAdpt extends BaseAdapter {
    String[] names;
    String[] price;
    int[] image;
    Context context;
    public CustomAdpt(MainActivity mainActivity, String[] itemNames, String[] startPrice, int[] itemImage) {

        this.names=itemNames;
        this.price=startPrice;
        this.image=itemImage;
        this.context=mainActivity;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(R.layout.custom,null);

        final TextView textView1 =rowView.findViewById(R.id.tv1);
        final TextView textView2=rowView.findViewById(R.id.tv2);
        ImageView imageView =rowView.findViewById(R.id.iv);
        LinearLayout linearLayout=rowView.findViewById(R.id.ll);

        textView1.setText(names[position]);
        textView2.setText(price[position]);
        imageView.setImageResource(image[position]);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Position:"+position, Toast.LENGTH_SHORT).show();
            }
        });
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "p:"+position, Toast.LENGTH_SHORT).show();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "posi:"+position, Toast.LENGTH_SHORT).show();
            }
        });

       /* linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=textView1.getText().toString()+textView2.getText().toString();
                Toast.makeText(context, s1, Toast.LENGTH_SHORT).show();
                Log.i("Res",s1);
            }
        });*/



        return rowView;
    }
}
