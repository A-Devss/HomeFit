package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class createProfileActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    EditText name_input, weight_input, height_input, gender_input;
    Button btnProceed, btnCreate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        name_input = findViewById(R.id.editTextName);
        weight_input = findViewById(R.id.editTextWeight);
        height_input = findViewById(R.id.editTextHeight);
        gender_input = findViewById(R.id.editTextGender);
        btnProceed = findViewById(R.id.buttonProceed);
        btnCreate = findViewById(R.id.buttonCreate);


    }
    @Override
    protected void onStart() {
        super.onStart();
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                databaseConnect myDb = new databaseConnect(createProfileActivity.this);

                myDb.addUser(name_input.getText().toString().trim(), weight_input.getText().toString().trim(),
                        height_input.getText().toString().trim(), gender_input.getText().toString().trim());
                name_input.setText("");
                weight_input.setText("");
                height_input.setText("");
                gender_input.setText("");

            }
        });
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(createProfileActivity.this, sampleNavi.class));
            }
        });
    }

    public void clearInputs(){
        height_input.setText("");
        weight_input.setText("");
        name_input.setText("");
        gender_input.setText("");
    }

    @Override
    public void onBackPressed() {
    }
}