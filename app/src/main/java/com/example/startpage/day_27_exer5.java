package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class day_27_exer5 extends AppCompatActivity implements View.OnClickListener{
    private Button btnFinish;
    private TextView btnBack;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day27_exer5);
        getSupportActionBar().setTitle("Day 27");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnFinish = findViewById(R.id.d27_btn_finish1);
        btnBack = findViewById(R.id.d27_btn_back5);
        btnFinish.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        SharedPreferencesHelper.initialize(this);
    }
    @Override
    public void onClick(View v) {
        //  int btn_id = v.getId();
        if(v == btnBack){
            startActivity(new Intent(day_27_exer5.this, day_27_exer4.class));
            overridePendingTransition(0, 0);
        }
        else if(v == btnFinish){
            Intent intent = new Intent(day_27_exer5.this, fullbody_page.class);
            SharedPreferencesHelper.setValue("Key_d27_fbody", R.drawable.bg_rounded_rectangle);
            startActivity(intent);
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
            startActivity(new Intent(day_27_exer5.this, day_27_exer4.class));
            overridePendingTransition(0, 0);
            return true; // Return true to indicate that the event has been handled
        }
        return super.onOptionsItemSelected(item);
    }
}