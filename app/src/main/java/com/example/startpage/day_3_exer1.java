package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class day_3_exer1 extends AppCompatActivity implements View.OnClickListener {

    private Button btn_next;
    private TextView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day3_exer1);
        getSupportActionBar().setTitle("Day 3");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_next = findViewById(R.id.d3_btn_next1);
        btn_next.setOnClickListener(this);
        btnBack = findViewById(R.id.d3_btn_back1);
        btnBack.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        int btn_id = v.getId();
        if(btn_id == R.id.d3_btn_back1){
            startActivity(new Intent(day_3_exer1.this, fullbody_page.class));
            overridePendingTransition(0, 0);
        }
        else if(btn_id == R.id.d3_btn_next1){
            startActivity(new Intent(day_3_exer1.this, day_3_exer2.class));
            overridePendingTransition(0, 0);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(day_3_exer1.this, fullbody_page.class));
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