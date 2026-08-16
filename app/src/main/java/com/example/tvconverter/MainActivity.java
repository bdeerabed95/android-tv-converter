package com.example.tvconverter;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.graphics.Color;
import android.view.Gravity;
import android.view.KeyEvent;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        LinearLayout layout = new LinearLayout(this);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT));
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.parseColor("#1a1a2e"));
        
        TextView title = new TextView(this);
        title.setText("Android TV Converter");
        title.setTextSize(32);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);
        title.setPadding(20, 20, 20, 20);
        
        TextView subtitle = new TextView(this);
        subtitle.setText("Video Converter for Android TV");
        subtitle.setTextSize(18);
        subtitle.setTextColor(Color.parseColor("#e0e0e0"));
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(20, 10, 20, 20);
        
        layout.addView(title);
        layout.addView(subtitle);
        
        setContentView(layout);
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
