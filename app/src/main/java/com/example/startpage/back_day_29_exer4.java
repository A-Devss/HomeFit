package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class back_day_29_exer4 extends AppCompatActivity implements View.OnClickListener{
    private Button btnFinish;
    private TextView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_day29_exer4);
        getSupportActionBar().setTitle("Day 29");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnFinish = findViewById(R.id.back_d29_btn_finish);
        btnFinish.setOnClickListener(this);
        btnBack = findViewById(R.id.back_d29_btn_back4);
        btnBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == btnBack){
            startActivity(new Intent(back_day_29_exer4.this, back_day_29_exer3.class));
            overridePendingTransition(0, 0);
        }
        else if(v == btnFinish){
            SharedPreferencesHelper.setValue("Key_d29_back", R.drawable.bg_rounded_rectangle);
            SharedPreferencesHelper.incrementValue();
            startActivity(new Intent(back_day_29_exer4.this, back_page.class));
            overridePendingTransition(0, 0);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(back_day_29_exer4.this, back_day_29_exer3.class));
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