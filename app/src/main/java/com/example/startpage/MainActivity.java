package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ProgressBar pb;
    int counter =0;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        prog();

    }
    @Override
    protected void onStart() {
        super.onStart();


    }
    public void prog(){
        pb= (ProgressBar) findViewById(R.id.pb1);
        Timer timer = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
               counter++;
               pb.setProgress(counter);
               if(counter == 100){
                   timer.cancel();
                   Intent intent = new Intent(MainActivity.this, createProfileActivity.class);
                   startActivity(intent);
               }
            }
        };
        timer.schedule(tt, 0, 40);
    }
}