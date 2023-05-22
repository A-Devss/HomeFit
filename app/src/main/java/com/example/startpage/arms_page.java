package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class arms_page extends AppCompatActivity implements View.OnClickListener {
    private Button btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,
            btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19,btn20,btn21,btn22,
            btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms_page);
        getSupportActionBar().setTitle("Arms");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        findViewID();
    }
    private  void findViewID(){
        btn1 = findViewById(R.id.btn_d1_arms);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn_d2_arms);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btn_d3_arms);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btn_d4_arms);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btn_d5_arms);
        btn5.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        if(v == btn1){
            startActivity(new Intent(arms_page.this, arms_day_1_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn2){
            startActivity(new Intent(arms_page.this, arms_day_2_exer1.class));
            overridePendingTransition(0, 0);
        } else if (v == btn3) {
            startActivity(new Intent(arms_page.this, arms_day_3_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn4) {
            startActivity(new Intent(arms_page.this, arms_day_4_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn5) {
            startActivity(new Intent(arms_page.this, arms_day_5_exer1.class));
            overridePendingTransition(0, 0);
        }
    }
}