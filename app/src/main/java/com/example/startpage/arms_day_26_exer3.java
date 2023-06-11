package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class arms_day_26_exer3 extends AppCompatActivity implements View.OnClickListener{
    private Button btn_next3;
    private TextView btn_back3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms_day26_exer3);
        getSupportActionBar().setTitle("Day 26");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_next3 = findViewById(R.id.arms_d26_btn_next3);
        btn_next3.setOnClickListener(this);
        btn_back3 = findViewById(R.id.arms_d26_btn_back3);
        btn_back3.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == btn_back3){
            startActivity(new Intent(arms_day_26_exer3.this, arms_day_26_exer2.class));
            overridePendingTransition(0, 0);
        }
        else if(v == btn_next3){
            startActivity(new Intent(arms_day_26_exer3.this, arms_day_26_exer4.class));
            overridePendingTransition(0, 0);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(arms_day_26_exer3.this, arms_day_26_exer2.class));
            overridePendingTransition(0, 0);
            return true; // Return true to indicate that the event has been handled
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }
}