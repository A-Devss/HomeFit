package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class day1_exer4 extends AppCompatActivity implements View.OnClickListener {

    private Button btnNext;
    private TextView btnBack;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1_exer4);
        getSupportActionBar().setTitle("Day 2");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnNext = findViewById(R.id.btn_next4);
        btnBack = findViewById(R.id.btn_back4);
        btnNext.setOnClickListener(this);
        btnBack.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int btn_id = v.getId();
        if(btn_id == R.id.btn_back4){
            startActivity(new Intent(day1_exer4.this, day_1_exer3.class));
            overridePendingTransition(0, 0);
        }
        else if(btn_id == R.id.btn_next4){
            startActivity(new Intent(day1_exer4.this, day_1_exer5.class));
            overridePendingTransition(0, 0);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(day1_exer4.this, day_1_exer3.class));
            overridePendingTransition(0, 0);
            return true; // Return true to indicate that the event has been handled
        }
        return super.onOptionsItemSelected(item);
    }
}