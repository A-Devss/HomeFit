package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Account extends AppCompatActivity {

    TextView weight_view, height_view, name_view, gender_view;
    Button btn_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().setTitle("Account");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        weight_view = findViewById(R.id.textView10);
        height_view = findViewById(R.id.textView12);
        name_view = findViewById(R.id.textView3);
        gender_view = findViewById(R.id.textView14);

    }

    @Override
    protected void onStart() {
        super.onStart();


    }
}