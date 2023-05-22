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
    private SharedPreferences sharedPreferences;
    private ImageView image;
    private static final int READ_EXTERNAL_STORAGE_PERMISSION_REQUEST = 1;
    private static final int PICK_IMAGE_REQUEST = 1;

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

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        String getName = sharedPreferences.getString("_name", "Your Name");
        String getWeight = sharedPreferences.getString("_weight", "0");
        String getHeight = sharedPreferences.getString("_height", "0");
        String getGender = sharedPreferences.getString("_gender", "askdhaf");
        name_view.setText(getName);
        weight_view.setText(getWeight);
        height_view.setText(getHeight);
        gender_view.setText(getGender);

    }

    @Override
    protected void onStart() {
        super.onStart();

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
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("_weight", weight_view.getText().toString());
            editor.putString("_height", height_view.getText().toString());
            editor.putString("_gender", gender_view.getText().toString());
            editor.apply();

            sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
            String getWeight = sharedPreferences.getString("_weight", "s");
            String getHeight = sharedPreferences.getString("_height", "s");
            String getGender = sharedPreferences.getString("_gender", "s");
            weight_view.setText(getWeight);
            height_view.setText(getHeight);
            gender_view.setText(getGender);
            weight_view.setEnabled(false);
            height_view.setEnabled(false);
            gender_view.setEnabled(false);
            btn_save.setEnabled(false);
            Toast.makeText(this, "saved successfully", Toast.LENGTH_SHORT).show();
        }else if (btn_id == R.id.imageView){
           /* Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, PICK_IMAGE_REQUEST);*/
            ImagePicker.with(Account.this)
                    .crop()
                    .compress(720)
                    .maxResultSize(720, 720)
                    .start();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


            // Get the selected image URI
            Uri selectedImageUri = data.getData();

            // Set the image as profile picture
            image.setImageURI(selectedImageUri);

            // Save the image URI for future use (optional)
            saveProfileImageUri(selectedImageUri);

    }
    private void saveProfileImageUri(Uri imageUri) {
        // Store the image URI using SharedPreferences, a database, or any other suitable storage mechanism
        // You can save it as a string or any other appropriate data type
        String uriString = imageUri.toString();

        // Save the image URI to SharedPreferences
        SharedPreferences preferences = getSharedPreferences("MyPrefs3", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("profileImageUri", uriString);
        editor.apply();
    }

}