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
    EditText language, lessonNo, lessonPara, quiz, lessonProblem;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://code-elevate-a1329-default-rtdb.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main_page);


        language=findViewById(R.id.language);
        lessonNo=findViewById(R.id.lesson_no);
        lessonPara=findViewById(R.id.insert_para);
        quiz=findViewById(R.id.insert_quiz);
        lessonProblem=findViewById(R.id.insert_problems);

        insertInfos=(Button)findViewById(R.id.insert_lesson_btn);


        insertInfos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String languageTxt,lessonNoTxt, lessonParaTxt,quizTxt, problemTxt;
                languageTxt=language.getText().toString();;
                lessonNoTxt=lessonNo.getText().toString();
                lessonParaTxt= lessonPara.getText().toString();
                quizTxt=quiz.getText().toString();
                problemTxt=lessonProblem.getText().toString();



                    databaseReference.child(languageTxt).addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot snapshot) {

                        }

                        @Override
                        public void onCancelled(DatabaseError error) {

                        }

                    });


                    databaseReference.child(languageTxt).child(lessonNoTxt).child("LessonNo").setValue(lessonNoTxt);
                    databaseReference.child(languageTxt).child(lessonNoTxt).child("para").setValue(lessonParaTxt);
                    databaseReference.child(languageTxt).child(lessonNoTxt).child("quiz").setValue(quizTxt);
                    databaseReference.child(languageTxt).child(lessonNoTxt).child("problems").setValue(problemTxt);

                    Toast.makeText(getApplicationContext(),"Insertion Successfull", Toast.LENGTH_SHORT).show();
                    //Toast.makeText(getApplicationContext(),"Welcome"+usernameTxt+"!", Toast.LENGTH_SHORT).show();

                    /*Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);*/


            }


        });
    }
}