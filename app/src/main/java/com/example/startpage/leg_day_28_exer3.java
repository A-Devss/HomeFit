package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class leg_day_28_exer3 extends AppCompatActivity implements View.OnClickListener{
    private Button btn_next;
    private TextView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg_day28_exer3);
        getSupportActionBar().setTitle("Day 28");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_next = findViewById(R.id.leg_d28_btn_next3);
        btn_next.setOnClickListener(this);
        btnBack = findViewById(R.id.leg_d28_btn_back3);
        btnBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == btnBack){
            startActivity(new Intent(leg_day_28_exer3.this, leg_day_28_exer2.class));
            overridePendingTransition(0, 0);
        }
        else if(v == btn_next){
            startActivity(new Intent(leg_day_28_exer3.this, leg_day_28_exer4.class));
            overridePendingTransition(0, 0);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(leg_day_28_exer3.this, leg_day_28_exer2.class));
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