package com.example.codeelevate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class C_Plus_Plus_Lessons extends AppCompatActivity {

    TextView paragraph,lesson_number;
    String Language, lessonNo;
    String quiz_database1,quiz_database2,quiz_database3,quiz_database4,quiz_database5,
            quiz_database_ans1,quiz_database_ans2,quiz_database_ans3,quiz_database_ans4,quiz_database_ans5,
            problems_database1,problems_database2,problems_database3,problems_database4,problems_database5;
    Button lesson_btn, quiz, problems;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://code-elevate-a1329-default-rtdb.firebaseio.com/");
    String paragraph_from_database, quiz_database, problems_database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_plus_lessons);


        paragraph = findViewById(R.id.para);


        Language = getIntent().getStringExtra("L_name");
        lessonNo = getIntent().getStringExtra("Lesson_name");
        databaseReference.child(Language).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot snapshot) {
                if(snapshot.hasChild(lessonNo)){
                    paragraph_from_database = snapshot.child(lessonNo).child("para").getValue(String.class);
                    quiz_database1 = snapshot.child(lessonNo).child("quiz").child("q1").getValue(String.class);
                    quiz_database2 = snapshot.child(lessonNo).child("quiz").child("q2").getValue(String.class);
                    quiz_database3 = snapshot.child(lessonNo).child("quiz").child("q3").getValue(String.class);
                    quiz_database4 = snapshot.child(lessonNo).child("quiz").child("q4").getValue(String.class);
                    quiz_database5 = snapshot.child(lessonNo).child("quiz").child("q5").getValue(String.class);
                    quiz_database_ans1 = snapshot.child(lessonNo).child("quiz").child("ans1").getValue(String.class);
                    quiz_database_ans2 = snapshot.child(lessonNo).child("quiz").child("ans1").getValue(String.class);
                    quiz_database_ans3 = snapshot.child(lessonNo).child("quiz").child("ans1").getValue(String.class);
                    quiz_database_ans4 = snapshot.child(lessonNo).child("quiz").child("ans1").getValue(String.class);
                    quiz_database_ans5 = snapshot.child(lessonNo).child("quiz").child("ans1").getValue(String.class);

                    problems_database1 = snapshot.child(lessonNo).child("problems1").getValue(String.class);
                    problems_database2 = snapshot.child(lessonNo).child("problems2").getValue(String.class);
                    problems_database3 = snapshot.child(lessonNo).child("problems3").getValue(String.class);
                    problems_database4 = snapshot.child(lessonNo).child("problems4").getValue(String.class);
                    problems_database5 = snapshot.child(lessonNo).child("problems5").getValue(String.class);
                }
            }

            @Override
            public void onCancelled(DatabaseError error) {

            }

        });
        lesson_number=findViewById(R.id.lesson_number);
        lesson_number.setText("Lesson : 0"+lessonNo);

        lesson_btn=(Button)findViewById(R.id.lesson_btn);

        lesson_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                paragraph.setText(paragraph_from_database);
            }

        });
        quiz=(Button)findViewById(R.id.quiz_btn);

        quiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                paragraph.setText(quiz_database1+"\n\n\n"+quiz_database2+"\n\n\n"+quiz_database3
                        +"\n\n\n"+quiz_database4+"\n\n\n"+quiz_database5);
            }

        });

        problems=(Button)findViewById(R.id.problems_btn);

        problems.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                paragraph.setText("PROBLEM 1:\n"+problems_database1+"\n\n\n"+
                        "PROBLEM 2:\n"+problems_database2+"\n\n\n"+
                        "PROBLEM 3:\n" +problems_database3+"\n\n\n"+
                        "PROBLEM 4:\n"+ problems_database4+"\n\n\n"+
                        "PROBLEM 5:\n"+problems_database5);
            }

        });

    }

}