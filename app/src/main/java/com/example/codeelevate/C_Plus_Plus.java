package com.example.codeelevate;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class C_Plus_Plus extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Button button, lesson_1,lesson_2,lesson_3,lesson_8,lesson_4,lesson_5,lesson_6,lesson_7;
    ImageView imageMenu;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_plus);


        lesson_1 = findViewById(R.id.c_lesson1);
        lesson_2 = findViewById(R.id.c_lesson2);
        lesson_3 = findViewById(R.id.c_lesson3);
        lesson_4 = findViewById(R.id.c_lesson4);
        lesson_5 = findViewById(R.id.c_lesson5);
        lesson_6 = findViewById(R.id.c_lesson6);
        lesson_7 = findViewById(R.id.c_lesson7);
        lesson_8 = findViewById(R.id.c_lesson8);

        lesson_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(C_Plus_Plus.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "cpp");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });

        lesson_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(C_Plus_Plus.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "cpp");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });


        lesson_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(C_Plus_Plus.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "cpp");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });


        lesson_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(C_Plus_Plus.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "cpp");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });



        lesson_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(C_Plus_Plus.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "cpp");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });



        lesson_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(C_Plus_Plus.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "cpp");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });



        lesson_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(C_Plus_Plus.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "cpp");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });

        lesson_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(C_Plus_Plus.this, C_Plus_Plus_Lessons.class);
                intent.putExtra("L_name", "cpp");
                intent.putExtra("Lesson_name", "1");
                startActivity(intent);
            }
        });

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_View);
        imageMenu = findViewById(R.id.imageMenu);

        toggle = new ActionBarDrawerToggle(C_Plus_Plus.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {



                switch (item.getItemId()) {
                    case R.id.nav_home:
                        Intent intent1 = new Intent(C_Plus_Plus.this,LanguageSelection.class);
                        startActivity(intent1);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_account:
                        Toast.makeText(C_Plus_Plus.this, "Facebook", Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.nav_leaderBoard:
                        Intent intent3 = new Intent(C_Plus_Plus.this,LeaderBoard.class);
                        startActivity(intent3);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.nav_signout:
                        Intent intent4 = new Intent(C_Plus_Plus.this,LoginActivity.class);
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