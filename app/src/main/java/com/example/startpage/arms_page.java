package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class arms_page extends AppCompatActivity implements View.OnClickListener {
    private Button btn;
    private int[] buttonIds = {
            R.id.btn_d1_arms, R.id.btn_d2_arms, R.id.btn_d3_arms, R.id.btn_d4_arms, R.id.btn_d5_arms, R.id.btn_d6_arms,
            R.id.btn_d7_arms, R.id.btn_d8_arms, R.id.btn_d9_arms, R.id.btn_d10_arms, R.id.btn_d11_arms, R.id.btn_d12_arms,
            R.id.btn_d13_arms, R.id.btn_d14_arms, R.id.btn_d15_arms, R.id.btn_d16_arms, R.id.btn_d17_arms, R.id.btn_d18_arms,
            R.id.btn_d19_arms, R.id.btn_d20_arms, R.id.btn_d21_arms, R.id.btn_d22_arms, R.id.btn_d23_arms, R.id.btn_d24_arms,
            R.id.btn_d25_arms, R.id.btn_d26_arms, R.id.btn_d27_arms, R.id.btn_d28_arms,
            R.id.btn_d29_arms, R.id.btn_d30_arms};
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
        for (int i = 0; i < buttonIds.length; i++) {
            btn= findViewById(buttonIds[i]);
            btn.setOnClickListener(this);
        }

    }
    @Override
    public void onClick(View v) {

        for (int i = 0; i < buttonIds.length; i++) {
            if (v.getId() == buttonIds[i]) {
                // Handle the click event for the corresponding button
                switch (i) {
                    case 0:
                        startActivity(new Intent(arms_page.this, arms_day_1_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d1_arms
                        break;
                    case 1:
                        startActivity(new Intent(arms_page.this, arms_day_2_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 2:
                        startActivity(new Intent(arms_page.this, arms_day_3_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 3:
                        startActivity(new Intent(arms_page.this, arms_day_4_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 4:
                        startActivity(new Intent(arms_page.this, arms_day_5_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 5:
                        startActivity(new Intent(arms_page.this, arms_day_6_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 6:
                        startActivity(new Intent(arms_page.this, arms_day_7_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 7:
                        startActivity(new Intent(arms_page.this, arms_day_8_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 8:
                        startActivity(new Intent(arms_page.this, arms_day_9_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 9:
                        startActivity(new Intent(arms_page.this, arms_day_10_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 10:
                        startActivity(new Intent(arms_page.this, arms_day_11_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 11:
                        startActivity(new Intent(arms_page.this, arms_day_12_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 12:
                        startActivity(new Intent(arms_page.this, arms_day_13_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 13:
                        startActivity(new Intent(arms_page.this, arms_day_14_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 14:
                        startActivity(new Intent(arms_page.this, arms_day_15_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 15:
                        startActivity(new Intent(arms_page.this, arms_day_16_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 16:
                        startActivity(new Intent(arms_page.this, arms_day_17_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 17:
                        startActivity(new Intent(arms_page.this, arms_day_18_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 18:
                        startActivity(new Intent(arms_page.this, arms_day_19_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 19:
                        startActivity(new Intent(arms_page.this, arms_day_20_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 20:
                        startActivity(new Intent(arms_page.this, arms_day_21_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 21:
                        startActivity(new Intent(arms_page.this, arms_day_22_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 22:
                        startActivity(new Intent(arms_page.this, arms_day_23_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 23:
                        startActivity(new Intent(arms_page.this, arms_day_24_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 24:
                        startActivity(new Intent(arms_page.this, arms_day_25_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 25:
                        startActivity(new Intent(arms_page.this, arms_day_26_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 26:
                        startActivity(new Intent(arms_page.this, arms_day_27_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 27:
                        startActivity(new Intent(arms_page.this, arms_day_28_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 28:
                        startActivity(new Intent(arms_page.this, arms_day_29_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;
                    case 29:
                        startActivity(new Intent(arms_page.this, arms_day_30_exer1.class));
                        overridePendingTransition(0, 0);
                        // Handle click for button with ID R.id.btn_d2_arms
                        break;

                    // Add cases for other button IDs as needed
                }
                break; // Exit the loop since the button ID was found
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0);
    }
}