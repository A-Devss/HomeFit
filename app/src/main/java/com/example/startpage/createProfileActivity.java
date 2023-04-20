package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class createProfileActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    EditText name_input, weight_input, height_input;
    private AutoCompleteTextView gender_input;
    private ImageView imDropDown;
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
        gender_input = findViewById(R.id.autoCompleteGender);
        imDropDown = findViewById(R.id.imDrop);
        btnProceed = findViewById(R.id.buttonProceed);
        btnCreate = findViewById(R.id.buttonCreate);

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, gender);
        gender_input.setAdapter(adapter);

    }
    private static final String[] gender = new String[]{"Male", "Female"};
    @Override
    protected void onStart() {
        super.onStart();
        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnProceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(createProfileActivity.this, sampleNavi.class));
            }
        });
        imDropDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender_input.showDropDown();
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