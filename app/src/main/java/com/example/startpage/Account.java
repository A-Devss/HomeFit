package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.dhaval2404.imagepicker.ImagePicker;

import java.util.Objects;

public class Account extends AppCompatActivity implements View.OnClickListener {
    private TextView weight_view, height_view, name_view, gender_view;
    private Button btn_edit, btn_save;
    private ImageView image;
    private static final int PICK_IMAGE_REQUEST = 1;
    private String sharedPrefFile;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

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

        weight_view.setEnabled(false);
        height_view.setEnabled(false);
        gender_view.setEnabled(false);

        btn_edit = findViewById(R.id.button);
        btn_edit.setOnClickListener(this);
        btn_save = findViewById(R.id.buttonSaveProfile);
        btn_save.setOnClickListener(this);

        image = findViewById(R.id.imageView);
        image.setOnClickListener(this);

        weight_view.setBackgroundColor(Color.TRANSPARENT);
        height_view.setBackgroundColor(Color.TRANSPARENT);
        gender_view.setBackgroundColor(Color.TRANSPARENT);
        btn_save.setEnabled(false);
        sharedPrefFile = "com.jtinosa.finals";
        sharedPreferences = getSharedPreferences(sharedPrefFile, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        SharedPreferencesHelper.initialize(this);

        displayInfo();



    }
    private void displayInfo(){
        String getName = SharedPreferencesHelper.displayName("_name", "Your Name");
        String getWeight = SharedPreferencesHelper.displayWeight("_weight", "");
        String getHeight = SharedPreferencesHelper.displayHeight("_height", "");
        String getGender = SharedPreferencesHelper.displayGender("_gender", "");
        name_view.setText(getName);
        weight_view.setText(getWeight);
        height_view.setText(getHeight);
        gender_view.setText(getGender);


    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void displayPhoto(){

        String uriString = sharedPreferences.getString("profile", null);
        if (uriString != null) {
            // Parse the URI string back to Uri object
            Uri imageUri = Uri.parse(uriString);
            // Set the image as profile picture in an ImageView
            image.setImageURI(imageUri);
        }
    }

    @Override
    public void onClick(View v) {
        int btn_id = v.getId();
        if(btn_id == R.id.button){
            weight_view.setEnabled(true);
            height_view.setEnabled(true);
            gender_view.setEnabled(true);

            btn_edit.setEnabled(false);
            btn_save.setEnabled(true);
        } else if (btn_id == R.id.buttonSaveProfile) {

            SharedPreferencesHelper.saveWeight("_weight", weight_view.getText().toString());
            SharedPreferencesHelper.saveHeight("_height", height_view.getText().toString());
            SharedPreferencesHelper.saveGender("_gender", gender_view.getText().toString());

            displayInfo();
            weight_view.setEnabled(false);
            height_view.setEnabled(false);
            gender_view.setEnabled(false);
            btn_save.setEnabled(false);
            Toast.makeText(this, "saved successfully", Toast.LENGTH_SHORT).show();
        }else if (btn_id == R.id.imageView){
            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, PICK_IMAGE_REQUEST);
            /*ImagePicker.with(Account.this)
                    .crop()
                    .compress(720)
                    .maxResultSize(720, 720)
                    .start();*/

        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == PICK_IMAGE_REQUEST && resultCode == RESULT_OK) {
            // Get the selected image URI
            Uri selectedImageUri = data.getData();

            // Set the image as profile picture
            image.setImageURI(selectedImageUri);

            // Save the image URI for future use
            saveProfileImageUri(selectedImageUri);
        }
    }
    private void saveProfileImageUri(Uri imageUri) {
        // Store the image URI using SharedPreferences, a database, or any other suitable storage mechanism
        // You can save it as a string or any other appropriate data type
        String uriString = imageUri.toString();
        // Save the image URI to SharedPreferences
        editor.putString("profile", uriString);
        editor.apply();
    }
}