package com.example.codeelevate;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class C_Plus_Plus extends AppCompatActivity {

    DrawerLayout dLayout;
    NavigationView navView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_plus);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("C++");
        setSupportActionBar(toolbar);





    }
}