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

public class sampleNavi extends AppCompatActivity {
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

    }
    @Override
    protected void onStart() {
        super.onStart();
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
                        Toast.makeText(sampleNavi.this, "Reports Selected", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(sampleNavi.this, report_menu.class));
                        break;
                    }
                }
                return false;
            }
        });
        btnFullbody = findViewById(R.id.btnFullBody);
        btnFullbody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sampleNavi.this, fullbody_page.class);
                startActivity(intent);
            }
        });
        btnArm = findViewById(R.id.btnArms);
        btnArm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sampleNavi.this, arms_page.class);
                startActivity(intent);
            }
        });
        btnAbs = findViewById(R.id.btnAbs);
        btnAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sampleNavi.this, abs_page.class));
            }
        });
        btnBack = findViewById(R.id.btnBacks);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sampleNavi.this, back_page.class));
            }
        });
        btnLegs = findViewById(R.id.btnLegs);
        btnLegs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sampleNavi.this, legs_page.class));
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
}