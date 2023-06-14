package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class abs_day_7_exer5 extends AppCompatActivity implements View.OnClickListener{
    private Button btn_next;
    private TextView btnBack;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_day7_exer5);
        getSupportActionBar().setTitle("Day 7");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_next = findViewById(R.id.abs_d7_btn_finish1);
        btn_next.setOnClickListener(this);
        btnBack = findViewById(R.id.abs_d7_btn_back5);
        btnBack.setOnClickListener(this);
        SharedPreferencesHelper.initialize(this);
    }
    @Override
    public void onClick(View v) {
        if(v == btnBack){
            startActivity(new Intent(abs_day_7_exer5.this, abs_day_7_exer4.class));
            overridePendingTransition(0, 0);
        }
        else if(v == btn_next){
            SharedPreferencesHelper.setValue("Key_d7_abs", R.drawable.bg_rounded_rectangle);
            SharedPreferencesHelper.incrementValue();
            startActivity(new Intent(abs_day_7_exer5.this, abs_page.class));
            overridePendingTransition(0, 0);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(abs_day_7_exer5.this, abs_day_7_exer4.class));
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