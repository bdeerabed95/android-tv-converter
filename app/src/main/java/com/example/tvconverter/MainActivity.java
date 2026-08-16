package com.example.tvconverter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView tv = new TextView(this);
        tv.setText("Android TV Converter");
        tv.setTextSize(30);
        tv.setTextColor(Color.WHITE);
        tv.setBackgroundColor(Color.BLACK);
        tv.setPadding(50, 50, 50, 50);
        
        setContentView(tv);
    }
}
