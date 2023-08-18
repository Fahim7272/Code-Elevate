package com.example.codeelevate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Admin_Main_Page extends AppCompatActivity {




    Button insertInfos;
    EditText language, lessonNo, lessonPara, quiz1,quiz2,quiz3,quiz4,quiz5,
            quiz_ans1, quiz_ans2, quiz_ans3, quiz_ans4, quiz_ans5,
            lessonProblem1, lessonProblem2, lessonProblem3 ,lessonProblem4 ,lessonProblem5;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://code-elevate-a1329-default-rtdb.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main_page);


        language=findViewById(R.id.language);
        lessonNo=findViewById(R.id.lesson_no);
        lessonPara=findViewById(R.id.insert_para);
        quiz1=findViewById(R.id.insert_quiz1);
        quiz2=findViewById(R.id.insert_quiz2);
        quiz3=findViewById(R.id.insert_quiz3);
        quiz4=findViewById(R.id.insert_quiz4);
        quiz5=findViewById(R.id.insert_quiz5);
        quiz_ans1=findViewById(R.id.insert_quiz_ans1);
        quiz_ans2=findViewById(R.id.insert_quiz_ans2);
        quiz_ans3=findViewById(R.id.insert_quiz_ans3);
        quiz_ans4=findViewById(R.id.insert_quiz_ans4);
        quiz_ans5=findViewById(R.id.insert_quiz_ans5);
        lessonProblem1=findViewById(R.id.insert_problems1);
        lessonProblem2=findViewById(R.id.insert_problems2);
        lessonProblem3=findViewById(R.id.insert_problems3);
        lessonProblem4=findViewById(R.id.insert_problems4);
        lessonProblem5=findViewById(R.id.insert_problems5);

        insertInfos=(Button)findViewById(R.id.insert_lesson_btn);

        insertInfos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String languageTxt,lessonNoTxt, lessonParaTxt, quizTxt, quizAnsTxt, problemTxt;
                languageTxt=language.getText().toString();;
                lessonNoTxt=lessonNo.getText().toString();
                lessonParaTxt= lessonPara.getText().toString();
                quizTxt=quiz1.getText().toString();
                quizAnsTxt=quiz_ans1.getText().toString();
                problemTxt=lessonProblem1.getText().toString();





                    databaseReference.child(languageTxt).addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot snapshot) {

                        }

                        @Override
                        public void onCancelled(DatabaseError error) {

                        }

                    });

                    if(lessonNoTxt.isEmpty() == false)
                        databaseReference.child(languageTxt).child(lessonNoTxt).child("LessonNo").setValue(lessonNoTxt);
                    if(lessonParaTxt.isEmpty() == false)
                        databaseReference.child(languageTxt).child(lessonNoTxt).child("para").setValue(lessonParaTxt);
                    if(quizTxt.isEmpty() == false)
                        databaseReference.child(languageTxt).child(lessonNoTxt).child("quiz").child("q1").setValue(quizTxt);
                    if(quizAnsTxt.isEmpty() == false)
                        databaseReference.child(languageTxt).child(lessonNoTxt).child("quiz").child("ans").setValue(quizAnsTxt);
                    if(problemTxt.isEmpty() == false)
                        databaseReference.child(languageTxt).child(lessonNoTxt).child("problems").setValue(problemTxt);

                    Toast.makeText(getApplicationContext(),"Insertion Successfull", Toast.LENGTH_SHORT).show();
                    //Toast.makeText(getApplicationContext(),"Welcome"+usernameTxt+"!", Toast.LENGTH_SHORT).show();

                    /*Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);*/


            }


        });
    }
}