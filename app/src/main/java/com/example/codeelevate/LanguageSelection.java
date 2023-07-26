package com.example.codeelevate;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LanguageSelection extends AppCompatActivity {

    AppCompatButton b1, b2;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_selection);


        b1=(AppCompatButton) findViewById(R.id.cpp);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(LanguageSelection.this, C_Plus_Plus.class);
                startActivity(intent);
            }
        });


        b2=(AppCompatButton) findViewById(R.id.java);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(LanguageSelection.this, Java.class);
                startActivity(intent);
            }
        });

        b3=(Button) findViewById(R.id.profile_btn);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(LanguageSelection.this, AccountInfo.class);
                startActivity(intent);
            }
        });
    }
}