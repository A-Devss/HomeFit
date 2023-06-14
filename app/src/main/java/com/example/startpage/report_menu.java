package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

public class report_menu extends AppCompatActivity {

    private TextView completes, bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_menu);
        getSupportActionBar().setTitle("Reports");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        completes = findViewById(R.id.tvCompletes);
        bmi = findViewById(R.id.tv_bmi);
        SharedPreferencesHelper.initialize(this);
        setCompletes();
        setBMI();

    }
    private void setCompletes(){
        int receivedValue = SharedPreferencesHelper.getIncrementedValue(this);
        // Display the value in the TextView
        completes.setText(String.valueOf(receivedValue));
    }
    private void setBMI(){
        String display_bmi = SharedPreferencesHelper.displayText("bmi", "");
        bmi.setText(display_bmi);
    }
}