package com.example.startpage;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.NavigableMap;

public class sampleNavi extends AppCompatActivity implements View.OnClickListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;
    Button btnFullbody, btnArm, btnAbs, btnBack, btnLegs;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_navi);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout, R.string.open, R.string.close);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Workouts");

        btnFullbody = findViewById(R.id.btnFullBody);
        btnArm = findViewById(R.id.btnArms);
        btnBack = findViewById(R.id.btnBacks);
        btnLegs = findViewById(R.id.btnLegs);
        btnAbs = findViewById(R.id.btnAbs);
        btnLegs.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnFullbody.setOnClickListener(this);
        btnAbs.setOnClickListener(this);
        btnArm.setOnClickListener(this);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.home:
                    {

                        startActivity(new Intent(sampleNavi.this, Account.class));
                        break;
                    }
                    case R.id.Calc:
                    {

                        startActivity(new Intent(sampleNavi.this, BMICalc.class));
                        break;
                    }
                    case R.id.reports:
                    {
                        startActivity(new Intent(sampleNavi.this, report_menu.class));
                        break;
                    }
                }
                return false;
            }
        });
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);

        }else{
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View v) {
        int itemId = v.getId();
        switch (itemId) {
            case R.id.btnFullBody: {

                startActivity(new Intent(sampleNavi.this, fullbody_page.class));
                break;
            }
            case R.id.btnArms: {

                startActivity(new Intent(sampleNavi.this, arms_page.class));
                break;
            }
            case R.id.btnBacks: {
                startActivity(new Intent(sampleNavi.this, back_page.class));
                break;
            }
            case R.id.btnAbs:{
                startActivity(new Intent(sampleNavi.this, abs_page.class));
                break;
            }
            case R.id.btnLegs:{
                startActivity(new Intent(sampleNavi.this, legs_page.class));
                break;
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}