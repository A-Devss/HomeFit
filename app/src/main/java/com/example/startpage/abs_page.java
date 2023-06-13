package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class abs_page extends AppCompatActivity implements View.OnClickListener{
    private final int[] buttonIds = {
            R.id.abs_d1, R.id.abs_d2, R.id.abs_d3, R.id.abs_d4, R.id.abs_d5, R.id.abs_d6, R.id.abs_d7,
            R.id.abs_d8,R.id.abs_d9, R.id.abs_d10, R.id.abs_d11, R.id.abs_d12, R.id.abs_d13, R.id.abs_d14,
            R.id.abs_d15, R.id.abs_d16, R.id.abs_d17, R.id.abs_d18, R.id.abs_d19, R.id.abs_d20, R.id.abs_d21,
            R.id.abs_d22, R.id.abs_d23, R.id.abs_d24, R.id.abs_d25, R.id.abs_d26, R.id.abs_d27, R.id.abs_d28,
            R.id.abs_d29, R.id.abs_d30};
    private Button btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_page);
        getSupportActionBar().setTitle("Abs");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btnClear = findViewById(R.id.abs_clear);
        btnClear.setOnClickListener(this);
        SharedPreferencesHelper.initialize(this);
        findViewID();
        setButtonBackground();

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }
    private  void findViewID(){
        for (int i = 0; i < buttonIds.length; i++) {
            Button btn= findViewById(buttonIds[i]);
            btn.setOnClickListener(this);
        }

    }
    private void setButtonBackground(){
        int defaultDrawableResource = R.drawable.circle_bg1;

        for (int i = 0; i < buttonIds.length; i++) {
            int buttonId = buttonIds[i];
            Button button = findViewById(buttonId);
            if (button != null) {
                String key = "Key_d" + (i + 1) + "_abs";
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
                String key = "Key_d" + i + "_abs";
                SharedPreferencesHelper.updateValue(key, defaultDrawableResource);
            }

            setButtonBackground();

        }
        for (int i = 0; i < buttonIds.length; i++) {
            if (v.getId() == buttonIds[i]) {
                // Handle the click event for the corresponding button
                switch (i) {
                    case 0:
                        startActivity(new Intent(abs_page.this, abs_day_1_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d1_arms
                        break;
                    case 1:
                        startActivity(new Intent(abs_page.this, abs_day_2_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 2:
                        startActivity(new Intent(abs_page.this, abs_day_3_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 3:
                        startActivity(new Intent(abs_page.this, abs_day_4_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 4:
                        startActivity(new Intent(abs_page.this, abs_day_5_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 5:
                        startActivity(new Intent(abs_page.this, abs_day_6_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 6:
                        startActivity(new Intent(abs_page.this, abs_day_7_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 7:
                        startActivity(new Intent(abs_page.this, abs_day_8_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 8:
                        startActivity(new Intent(abs_page.this, abs_day_9_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 9:
                        startActivity(new Intent(abs_page.this, abs_day_10_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 10:
                        startActivity(new Intent(abs_page.this, abs_day_11_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 11:
                        startActivity(new Intent(abs_page.this, abs_day_12_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 12:
                        startActivity(new Intent(abs_page.this, abs_day_13_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 13:
                        startActivity(new Intent(abs_page.this, abs_day_14_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 14:
                        startActivity(new Intent(abs_page.this, abs_day_15_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 15:
                        startActivity(new Intent(abs_page.this, abs_day_16_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 16:
                        startActivity(new Intent(abs_page.this, abs_day_17_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 17:
                        startActivity(new Intent(abs_page.this, abs_day_18_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 18:
                        startActivity(new Intent(abs_page.this, abs_day_19_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 19:
                        startActivity(new Intent(abs_page.this, abs_day_20_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 20:
                        startActivity(new Intent(abs_page.this, abs_day_21_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 21:
                        startActivity(new Intent(abs_page.this, abs_day_22_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 22:
                        startActivity(new Intent(abs_page.this, abs_day_23_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 23:
                        startActivity(new Intent(abs_page.this, abs_day_24_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 24:
                        startActivity(new Intent(abs_page.this, abs_day_25_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 25:
                        startActivity(new Intent(abs_page.this, abs_day_26_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 26:
                        startActivity(new Intent(abs_page.this, abs_day_27_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 27:
                        startActivity(new Intent(abs_page.this, abs_day_28_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 28:
                        startActivity(new Intent(abs_page.this, abs_day_29_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 29:
                        startActivity(new Intent(abs_page.this, abs_day_30_exer1.class));
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