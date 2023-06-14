package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class leg_day_25_exer5 extends AppCompatActivity implements View.OnClickListener{
    private Button btnFinish;
    private TextView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_day25_exer5);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Day 25");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnFinish = findViewById(R.id.leg_d25_btn_finish);
        btnFinish.setOnClickListener(this);
        btnBack = findViewById(R.id.leg_d25_btn_back5);
        btnBack.setOnClickListener(this);
        SharedPreferencesHelper.initialize(this);
    }
    @Override
    public void onClick(View v) {
        if(v == btnBack){
            startActivity(new Intent(leg_day_25_exer5.this, leg_day_25_exer4.class));
            overridePendingTransition(0, 0);
        }
        else if(v == btnFinish){
            SharedPreferencesHelper.setValue("Key_d25_legs", R.drawable.bg_rounded_rectangle);
            SharedPreferencesHelper.incrementValue();
            startActivity(new Intent(leg_day_25_exer5.this, legs_page.class));
            overridePendingTransition(0, 0);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(leg_day_25_exer5.this, leg_day_25_exer4.class));
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