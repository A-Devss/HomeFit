package com.example.startpage;

import static com.example.startpage.day_1.REQUEST_CODE_ACTIVITY_C;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class day_1_exer2 extends AppCompatActivity implements View.OnClickListener {

    private Button btn_next2;
    private TextView btn_back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1_exer2);
        btn_next2 = findViewById(R.id.btn_next2);
        btn_back2 = findViewById(R.id.btn_back2);
        btn_next2.setOnClickListener(this);
        btn_back2.setOnClickListener(this);
       getSupportActionBar().setTitle("Day 1");
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onClick(View v) {
        int btn_id = v.getId();
        if(btn_id == R.id.btn_back2){
            startActivity(new Intent(day_1_exer2.this, day_1.class));
            overridePendingTransition(0, 0);
        }else if (btn_id == R.id.btn_next2){
            startActivity(new Intent(day_1_exer2.this, day_1_exer3.class));
            overridePendingTransition(0, 0);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(day_1_exer2.this, day_1.class));
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