package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class bmi_classification extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_classification);
        getSupportActionBar().setTitle("BMI Classification");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}