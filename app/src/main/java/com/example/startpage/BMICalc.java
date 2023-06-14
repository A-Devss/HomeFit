package com.example.startpage;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMICalc extends AppCompatActivity {

    EditText weight, height;
    TextView result, bmiclass;
    Button btn_calc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalc);
        getSupportActionBar().setTitle("BMI Calculator");
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        weight = findViewById(R.id.weightcalc);
        height = findViewById(R.id.heightcalc);
        result = findViewById(R.id.result_bmi);
        btn_calc = findViewById(R.id.btn_calc);
        bmiclass = findViewById(R.id.textView16);
        SharedPreferencesHelper.initialize(this);
    }
    @Override
    protected void onStart() {
        super.onStart();
        btn_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(weight.getText().toString().isEmpty() || height.getText().toString().isEmpty()){
                    Toast.makeText(BMICalc.this, "Please input info.", Toast.LENGTH_SHORT).show();
                }else{
                    double w = Double.parseDouble(weight.getText().toString());
                    double h = Double.parseDouble(height.getText().toString());
                    double bmi = calculateBMI(w, h);
                    String rs = String.format("%.2f",bmi);
                    result.setText(rs);//sample

                    AlertDialog.Builder builder = new AlertDialog.Builder(BMICalc.this);
                    builder.setMessage("Do you want to display your BMI?");
                    builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // User clicked "Yes", perform the action to display something in another class
                            SharedPreferencesHelper.saveText("bmi", rs);
                        }
                    });
                    builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // User clicked "No", do nothing
                        }
                    });
                    builder.show();
                }

            }
        });
        bmiclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BMICalc.this, bmi_classification.class));
            }
        });
    }

    double calculateBMI(double weight, double height){
        double bmi = weight / (height * height);
        return bmi;
    }

}
