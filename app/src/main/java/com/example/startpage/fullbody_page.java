package com.example.startpage;

import static com.example.startpage.day_1.REQUEST_CODE_ACTIVITY_C;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class fullbody_page extends AppCompatActivity  implements View.OnClickListener {
    private Button btnClear,btn1, btn2, btn3,btn4,btn5,btn6,btn7,
            btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,
            btn17,btn18,btn19,btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29,btn30;
    private SharedPreferences sharedPreferences;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullbody_page);
        getSupportActionBar().setTitle("Full Body");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnClear = findViewById(R.id.fbody_clear);
        btnClear.setOnClickListener(this);

        findViewIDbutton();
        setButtonBackground();

    }

    @Override
    protected void onResume() {
        super.onResume();


    }
    private void findViewIDbutton(){
        btn1 = findViewById(R.id.btn_d1_fullbody);
        btn1.setOnClickListener(this);
        btn2 = findViewById(R.id.btn_d2_fullbody);
        btn2.setOnClickListener(this);
        btn3 = findViewById(R.id.btn_d3_fullbody);
        btn3.setOnClickListener(this);
        btn4 = findViewById(R.id.btn_d4_fullbody);
        btn4.setOnClickListener(this);
        btn5 = findViewById(R.id.btn_d5_fullbody);
        btn5.setOnClickListener(this);
        btn6 = findViewById(R.id.btn_d6_fullbody);
        btn6.setOnClickListener(this);
        btn7 = findViewById(R.id.btn_d7_fullbody);
        btn7.setOnClickListener(this);
        btn8 = findViewById(R.id.btn_d8_fullbody);
        btn8.setOnClickListener(this);
        btn9 = findViewById(R.id.btn_d9_fullbody);
        btn9.setOnClickListener(this);
        btn10 = findViewById(R.id.btn_d10_fullbody);
        btn10.setOnClickListener(this);
        btn11 = findViewById(R.id.btn_d11_fullbody);
        btn11.setOnClickListener(this);
        btn12 = findViewById(R.id.btn_d12_fullbody);
        btn12.setOnClickListener(this);
        btn13 = findViewById(R.id.btn_d13_fullbody);
        btn13.setOnClickListener(this);
        btn14 = findViewById(R.id.btn_d14_fullbody);
        btn14.setOnClickListener(this);
        btn15 = findViewById(R.id.btn_d15_fullbody);
        btn15.setOnClickListener(this);
        btn16 = findViewById(R.id.btn_d16_fullbody);
        btn16.setOnClickListener(this);
        btn17= findViewById(R.id.btn_d17_fullbody);
        btn17.setOnClickListener(this);
        btn18 = findViewById(R.id.btn_d18_fullbody);
        btn18.setOnClickListener(this);
        btn19 = findViewById(R.id.btn_d19_fullbody);
        btn19.setOnClickListener(this);
        btn20 = findViewById(R.id.btn_d20_fullbody);
        btn20.setOnClickListener(this);
        btn21 = findViewById(R.id.btn_d21_fullbody);
        btn21.setOnClickListener(this);
        btn22 = findViewById(R.id.btn_d22_fullbody);
        btn22.setOnClickListener(this);
        btn23 = findViewById(R.id.btn_d23_fullbody);
        btn23.setOnClickListener(this);
        btn24 = findViewById(R.id.btn_d24_fullbody);
        btn24.setOnClickListener(this);
        btn25 = findViewById(R.id.btn_d25_fullbody);
        btn25.setOnClickListener(this);
        btn26 = findViewById(R.id.btn_d26_fullbody);
        btn26.setOnClickListener(this);
        btn27 = findViewById(R.id.btn_d27_fullbody);
        btn27.setOnClickListener(this);
        btn28 = findViewById(R.id.btn_d28_fullbody);
        btn28.setOnClickListener(this);
        btn29 = findViewById(R.id.btn_d29_fullbody);
        btn29.setOnClickListener(this);
        btn30 = findViewById(R.id.btn_d30_fullbody);
        btn30.setOnClickListener(this);

    }
    private void setButtonBackground() {
       /* sharedPreferences = getSharedPreferences("MyPrefs_d1", Context.MODE_PRIVATE);
        int getDrawable = sharedPreferences.getInt("key_d1", R.drawable.circle_bg1);

           btn1.setBackgroundResource(getDrawable);*/
//        sharedPreferences = getSharedPreferences("MyPrefs_d2", Context.MODE_PRIVATE);
//        int getBackground_2 = sharedPreferences.getInt("key_d2", R.drawable.circle_bg1);
//        btn2.setBackgroundResource(getBackground_2);
//
//        sharedPreferences = getSharedPreferences("MyPrefs_d3", Context.MODE_PRIVATE);
//        int getBackground_3 = sharedPreferences.getInt("key_d3", R.drawable.circle_bg1);
//        btn3.setBackgroundResource(getBackground_3);
//
//        sharedPreferences = getSharedPreferences("MyPrefs_d4", Context.MODE_PRIVATE);
//        int getBackground_4 = sharedPreferences.getInt("key_d4", R.drawable.circle_bg1);
//        btn4.setBackgroundResource(getBackground_4);
//
//        sharedPreferences = getSharedPreferences("MyPrefs_d5", Context.MODE_PRIVATE);
//        int getBackground_5 = sharedPreferences.getInt("key_d5", R.drawable.circle_bg1);
//        btn5.setBackgroundResource(getBackground_5);
//
//        sharedPreferences = getSharedPreferences("MyPrefs_d6", Context.MODE_PRIVATE);
//        int getBackground_6 = sharedPreferences.getInt("key_d6", R.drawable.circle_bg1);
//        btn6.setBackgroundResource(getBackground_6);
//
//        sharedPreferences = getSharedPreferences("MyPrefs_d7", Context.MODE_PRIVATE);
//        int getBackground_7 = sharedPreferences.getInt("key_d7", R.drawable.circle_bg1);
//        btn7.setBackgroundResource(getBackground_7);
//
//        sharedPreferences = getSharedPreferences("MyPrefs_d8", Context.MODE_PRIVATE);
//        int getBackground_8 = sharedPreferences.getInt("key_d8", R.drawable.circle_bg1);
//        btn8.setBackgroundResource(getBackground_8);
//
//        sharedPreferences = getSharedPreferences("MyPrefs_d9", Context.MODE_PRIVATE);
//        int getBackground_9 = sharedPreferences.getInt("key_d9", R.drawable.circle_bg1);
//        btn9.setBackgroundResource(getBackground_9);
//
//        sharedPreferences = getSharedPreferences("MyPrefs_d10", Context.MODE_PRIVATE);
//        int getBackground_10 = sharedPreferences.getInt("key_d10", R.drawable.circle_bg1);
//        btn10.setBackgroundResource(getBackground_10);
    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(fullbody_page.this, sampleNavi.class));
        overridePendingTransition(0, 0);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            // Handle the back button click here or leave it empty to cancel the default animation
            startActivity(new Intent(fullbody_page.this, sampleNavi.class));
            overridePendingTransition(0, 0);
            return true; // Return true to indicate that the event has been handled
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        //int btn_id = v.getId();
        if(v == btn1){
            startActivity(new Intent(fullbody_page.this, day_1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn2){
            startActivity(new Intent(fullbody_page.this, day_2_exer1.class));
            overridePendingTransition(0, 0);
        } else if (v == btn3) {
            startActivity(new Intent(fullbody_page.this, day_3_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn4) {
            startActivity(new Intent(fullbody_page.this, day_4_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn5) {
            startActivity(new Intent(fullbody_page.this, day_5_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn6) {
            startActivity(new Intent(fullbody_page.this, day_6_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn7) {
            startActivity(new Intent(fullbody_page.this, day_7_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn8) {
            startActivity(new Intent(fullbody_page.this, day_8_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn9) {
            startActivity(new Intent(fullbody_page.this, day_9_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn10) {
            startActivity(new Intent(fullbody_page.this, day_10_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn11) {
            startActivity(new Intent(fullbody_page.this, day_11_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn12) {
            startActivity(new Intent(fullbody_page.this, day_12_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn13) {
            startActivity(new Intent(fullbody_page.this, day_13_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn14) {
            startActivity(new Intent(fullbody_page.this, day_14_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn15) {
            startActivity(new Intent(fullbody_page.this, day_15_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn16) {
            startActivity(new Intent(fullbody_page.this, day_16_exer1.class));
            overridePendingTransition(0, 0);
        }
        else if (v == btn17) {
            startActivity(new Intent(fullbody_page.this, day_17_exer1.class));
            overridePendingTransition(0, 0);
        }
        else if (v == btn18) {
            startActivity(new Intent(fullbody_page.this, day_18_exer1.class));
            overridePendingTransition(0, 0);
        }
        else if (v == btn19) {
            startActivity(new Intent(fullbody_page.this, day_19_exer1.class));
            overridePendingTransition(0, 0);
        }
        else if (v == btn20) {
            startActivity(new Intent(fullbody_page.this, day_20_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn21) {
            startActivity(new Intent(fullbody_page.this, day_21_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn22) {
            startActivity(new Intent(fullbody_page.this, day_22_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn23) {
            startActivity(new Intent(fullbody_page.this, day_23_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn24) {
            startActivity(new Intent(fullbody_page.this, day_24_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn25) {
            startActivity(new Intent(fullbody_page.this, day_25_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn26) {
            startActivity(new Intent(fullbody_page.this, day_26_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn27) {
            startActivity(new Intent(fullbody_page.this, day_27_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn28) {
            startActivity(new Intent(fullbody_page.this, day_28_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn29) {
            startActivity(new Intent(fullbody_page.this, day_29_exer1.class));
            overridePendingTransition(0, 0);
        }else if (v == btn30) {
            startActivity(new Intent(fullbody_page.this, day_30_exer1.class));
            overridePendingTransition(0, 0);
        }

       /* clear button;*/
        if(v == btnClear){
            sharedPreferences = getSharedPreferences("MyPrefs_d1", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putInt("key_d1",R.drawable.circle_bg1);
            editor.apply();

            sharedPreferences = getSharedPreferences("MyPrefs_d1", Context.MODE_PRIVATE);
            int resetBG = sharedPreferences.getInt("key_d1", R.drawable.circle_bg1);
            btn1.setBackgroundResource(resetBG);
        }
    }

}