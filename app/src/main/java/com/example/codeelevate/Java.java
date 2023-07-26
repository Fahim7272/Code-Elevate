package com.example.codeelevate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class Java extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);

        Toolbar toolbar = findViewById(R.id.java_toolbar);
        toolbar.setTitle("JAVA");
        setSupportActionBar(toolbar);
    }
}