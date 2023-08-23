package com.example.codeelevate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.w3c.dom.Text;

public class AccountInfo extends AppCompatActivity {


    TextView name, userName, email, stopstalk, progress;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://code-elevate-a1329-default-rtdb.firebaseio.com/");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_info);

        name = findViewById(R.id.usernamee);
        userName = findViewById(R.id.usernamee);
        email = findViewById(R.id.nameee);
        stopstalk = findViewById(R.id.nameee);





        databaseReference.child("user").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                if(snapshot.hasChild("")){
                    /*name = snapshot.child("user").child("para").getValue(String.class);
                    userName = snapshot.child("user").child("quiz").getValue(String.class);
                    stopstalk = snapshot.child("user").child("problems").getValue(String.class);*/
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }

        });


    }
}