package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class day_1_exer2 extends AppCompatActivity implements View.OnClickListener {

    private Button btn_finish;
    private TextView btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1_exer2);
       btn_finish = findViewById(R.id.btn_finish);
       btn_back = findViewById(R.id.btn_back);
       btn_finish.setOnClickListener(this);
       btn_back.setOnClickListener(this);
       getSupportActionBar().setTitle("Day 1");
       getSupportActionBar().setDisplayHomeAsUpEnabled(true);
       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onClick(View v) {
        int btn_id = v.getId();
        if(btn_id == R.id.btn_back){
            startActivity(new Intent(day_1_exer2.this, day_1.class));
        }else{
            startActivity(new Intent(day_1_exer2.this, fullbody_page.class));
        }
    }
}