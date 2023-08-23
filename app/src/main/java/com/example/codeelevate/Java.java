package com.example.codeelevate;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class Java extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Button button, lesson_1,lesson_2,lesson_3,lesson_8,lesson_4,lesson_5,lesson_6,lesson_7;

    ImageView imageMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);




        lesson_1 = findViewById(R.id.lesson1);
        lesson_2 = findViewById(R.id.lesson2);
        lesson_3 = findViewById(R.id.lesson3);
        lesson_4 = findViewById(R.id.lesson4);
        lesson_5 = findViewById(R.id.lesson5);
        lesson_6 = findViewById(R.id.lesson6);
        lesson_7 = findViewById(R.id.lesson7);
        lesson_8 = findViewById(R.id.lesson8);

        lesson_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Java.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "java");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });

        lesson_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Java.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "java");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });


        lesson_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Java.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "java");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });


        lesson_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Java.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "java");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });



        lesson_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Java.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "java");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });



        lesson_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Java.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "java");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });



        lesson_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Java.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "java");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });

        lesson_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(Java.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "java");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });









        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_View);
        imageMenu = findViewById(R.id.imageMenu);

        toggle = new ActionBarDrawerToggle(Java.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected( MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_home:
                        Intent intent1 = new Intent(Java.this,LanguageSelection.class);
                        startActivity(intent1);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_account:
                        Intent intent2 = new Intent(Java.this,AccountInfo.class);
                        Intent intentt = getIntent();
                        String userName = intentt.getStringExtra("user_name");
                        intentt.putExtra("user_name", userName);
                        startActivity(intent2);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.nav_leaderBoard:
                        Intent intent3 = new Intent(Java.this,LeaderBoard.class);
                        startActivity(intent3);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_signout:
                        Intent intent4 = new Intent(Java.this,LoginActivity.class);
                        startActivity(intent4);
                        drawerLayout.closeDrawers();
                        break;

                }
                return false;
            }
        });

        imageMenu = findViewById(R.id.imageMenu);

        imageMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Code Here
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }
}