package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class legs_page extends AppCompatActivity implements View.OnClickListener{
    private final int[] buttonIds = {
            R.id.btn_d1_legs, R.id.btn_d2_legs, R.id.btn_d3_legs, R.id.btn_d4_legs, R.id.btn_d5_legs, R.id.btn_d6_legs, R.id.btn_d7_legs,
            R.id.btn_d8_legs,R.id.btn_d9_legs, R.id.btn_d10_legs, R.id.btn_d11_legs, R.id.btn_d12_legs, R.id.btn_d13_legs, R.id.btn_d14_legs,
            R.id.btn_d15_legs, R.id.btn_d16_legs, R.id.btn_d17_legs, R.id.btn_d18_legs, R.id.btn_d19_legs, R.id.btn_d20_legs, R.id.btn_d21_legs,
            R.id.btn_d22_legs, R.id.btn_d23_legs, R.id.btn_d24_legs, R.id.btn_d25_legs, R.id.btn_d26_legs, R.id.btn_d27_legs, R.id.btn_d28_legs,
            R.id.btn_d29_legs, R.id.btn_d30_legs};
    private Button btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_page);
        getSupportActionBar().setTitle("Legs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnClear = findViewById(R.id.legs_clear);
        btnClear.setOnClickListener(this);
        SharedPreferencesHelper.initialize(this);
        findViewID();
        setButtonBackground();

    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(legs_page.this, sampleNavi.class));
        overridePendingTransition(0, 0);
    }
    private  void findViewID(){
        for (int buttonId : buttonIds) {
            Button btn = findViewById(buttonId);
            btn.setOnClickListener(this);
        }

    }
    private void setButtonBackground(){
        int defaultDrawableResource = R.drawable.circle_bg1;

        for (int i = 0; i < buttonIds.length; i++) {
            int buttonId = buttonIds[i];
            Button button = findViewById(buttonId);
            if (button != null) {
                String key = "Key_d" + (i + 1) + "_legs";
                int drawableResource = SharedPreferencesHelper.getValue(key, defaultDrawableResource);
                button.setBackgroundResource(drawableResource);
            }
        }
    }
    @Override
    public void onClick(View v) {
        if (v == btnClear){
            int numberOfItems = 30;
            int defaultDrawableResource = R.drawable.circle_bg1;

            for (int i = 1; i <= numberOfItems; i++) {
                String key = "Key_d" + i + "_legs";
                SharedPreferencesHelper.updateValue(key, defaultDrawableResource);
            }

            setButtonBackground();

        }
        for (int i = 0; i < buttonIds.length; i++) {
            if (v.getId() == buttonIds[i]) {
                // Handle the click event for the corresponding button
                switch (i) {
                    case 0:
                        startActivity(new Intent(legs_page.this, leg_day_1_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d1_arms
                        break;
                    case 1:
                        startActivity(new Intent(legs_page.this, leg_day_2_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 2:
                        startActivity(new Intent(legs_page.this, leg_day_3_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 3:
                        startActivity(new Intent(legs_page.this, leg_day_4_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 4:
                        startActivity(new Intent(legs_page.this, leg_day_5_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 5:
                        startActivity(new Intent(legs_page.this, abs_day_6_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 6:
                        startActivity(new Intent(legs_page.this, leg_day_7_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 7:
                        startActivity(new Intent(legs_page.this, leg_day_8_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 8:
                        startActivity(new Intent(legs_page.this, leg_day_9_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 9:
                        startActivity(new Intent(legs_page.this, leg_day_10_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 10:
                        startActivity(new Intent(legs_page.this, leg_day_11_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 11:
                        startActivity(new Intent(legs_page.this, leg_day_12_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 12:
                        startActivity(new Intent(legs_page.this, leg_day_13_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 13:
                        startActivity(new Intent(legs_page.this, leg_day_14_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 14:
                        startActivity(new Intent(legs_page.this, leg_day_15_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 15:
                        startActivity(new Intent(legs_page.this, leg_day_16_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 16:
                        startActivity(new Intent(legs_page.this, leg_day_17_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 17:
                        startActivity(new Intent(legs_page.this, leg_day_18_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 18:
                        startActivity(new Intent(legs_page.this, leg_day_19_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 19:
                        startActivity(new Intent(legs_page.this, leg_day_20_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 20:
                        startActivity(new Intent(legs_page.this, leg_day_21_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 21:
                        startActivity(new Intent(legs_page.this, leg_day_22_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 22:
                        startActivity(new Intent(legs_page.this, leg_day_23_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 23:
                        startActivity(new Intent(legs_page.this, leg_day_24_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 24:
                        startActivity(new Intent(legs_page.this, leg_day_25_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 25:
                        startActivity(new Intent(legs_page.this, leg_day_26_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 26:
                        startActivity(new Intent(legs_page.this, leg_day_27_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 27:
                        startActivity(new Intent(legs_page.this, leg_day_28_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 28:
                        startActivity(new Intent(legs_page.this, leg_day_29_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 29:
                        startActivity(new Intent(legs_page.this, leg_day_30_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;

                    // Add cases for other button IDs as needed
                }
                break; // Exit the loop since the button ID was found
            }
        }
    }
}