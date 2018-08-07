package com.example.rong.flatlistbugnative;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScrollView scrollView = findViewById(R.id.Flatlist);
        //Log.d("Tag","Pivot Before: " + scrollView.getPivotY());

        LinearLayout linearlayout = findViewById(R.id.Linearlayout);

        for(int i = 0; i < 1000; i++) {
            TextView textview = new TextView(getApplicationContext());
            textview.setText("Hello Meir " + i);
            linearlayout.addView(textview);
        }

        //scrollView.setPivotY(0);
        //Log.d("Tag","Pivot After: " + scrollView.getPivotY());
    }
}
