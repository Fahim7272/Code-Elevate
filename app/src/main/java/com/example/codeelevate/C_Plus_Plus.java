package com.example.codeelevate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
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
    Button button;
    ImageView imageMenu;
    RecyclerView recyclerView;

    String Lessions_name[]={"Lession 1","Lession 2","Lession 3","Lession 4","Lession 5","Lession 6",
            "Lession 7","Lession 8", "Lession 9","Lession 10","Lession 11","Lession 12","Lession 13",
            "Lession 14","Lession 15","Lession 16","Lession 17"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_plus);



        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_View);
        imageMenu = findViewById(R.id.imageMenu);

        toggle = new ActionBarDrawerToggle(C_Plus_Plus.this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

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