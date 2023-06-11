package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class arms_day_2_exer5 extends AppCompatActivity implements View.OnClickListener{
    private Button btnFinish;
    private TextView btn_back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms_day2_exer5);
        getSupportActionBar().setTitle("Day 2");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnFinish = findViewById(R.id.arms_d2_btn_finish1);
        btnFinish.setOnClickListener(this);
        btn_back2 = findViewById(R.id.arms_d2_btn_back5);
        btn_back2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if(v == btn_back2){
            startActivity(new Intent(arms_day_2_exer5.this, arms_day_2_exer4.class));
            overridePendingTransition(0, 0);
        }
        else if(v == btnFinish){
            //sharedPreferences = getSharedPreferences("MyPrefs_d10", Context.MODE_PRIVATE);
//            SharedPreferences.Editor editor = sharedPreferences.edit();
//            editor.putInt("key_d10", R.drawable.bg_rounded_rectangle);
//            editor.apply();
            startActivity(new Intent(arms_day_2_exer5.this, arms_page.class));
            overridePendingTransition(0, 0);

        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(arms_day_2_exer5.this, arms_day_2_exer4.class));
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