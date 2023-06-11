package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class back_day_1_exer3 extends AppCompatActivity implements View.OnClickListener{
        private Button btn_next;
        private TextView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_day1_exer3);
        getSupportActionBar().setTitle("Day 1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_next = findViewById(R.id.back_d1_btn_next3);
        btn_next.setOnClickListener(this);
        btnBack = findViewById(R.id.back_d1_btn_back3);
        btnBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == btnBack){
            startActivity(new Intent(back_day_1_exer3.this, back_day_1_exer2.class));
            overridePendingTransition(0, 0);
        }
        else if(v == btn_next){
            startActivity(new Intent(back_day_1_exer3.this, back_day_1_exer4.class));
            overridePendingTransition(0, 0);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(back_day_1_exer3.this, back_day_1_exer2.class));
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