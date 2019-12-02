package com.ibm.customlistapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String[] itemNames={"aaa","bbb","ccc","ddd"};
    String[] startPrice={"17000","6000","5000","1000"};
    int[] itemImage={R.drawable.aaa,R.drawable.bbb,R.drawable.ccc,R.drawable.ddd};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.list);

        listView.setAdapter(new CustomAdpt(MainActivity.this,itemNames,startPrice,itemImage));

    }
}
