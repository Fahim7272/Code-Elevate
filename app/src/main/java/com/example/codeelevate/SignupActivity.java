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

public class SignupActivity extends AppCompatActivity {


    Button signUpBtn;
    EditText fullname,username, email,password;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://code-elevate-a1329-default-rtdb.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        fullname=findViewById(R.id.signup_full_name);
        username=findViewById(R.id.signup_username);
        password=findViewById(R.id.signup_password);
        email=findViewById(R.id.signup_email);

        signUpBtn=(Button)findViewById(R.id.signUp_btn);


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String fullnameTxt,usernameTxt, emailTxt,passwordTxt;
                usernameTxt=username.getText().toString();;
                passwordTxt=password.getText().toString();
                fullnameTxt= fullname.getText().toString();
                emailTxt=email.getText().toString();

                if(fullnameTxt.isEmpty()&&usernameTxt.isEmpty()&&emailTxt.isEmpty()&&passwordTxt.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Please fill all filds!", Toast.LENGTH_SHORT).show();
                }
                else if(passwordTxt.length()<6){
                    Toast.makeText(getApplicationContext(),"Password length is too short!", Toast.LENGTH_SHORT).show();
                }
                else{
                    databaseReference.child("user").addListenerForSingleValueEvent(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot snapshot) {
                            if(snapshot.hasChild(usernameTxt)){
                                //Toast.makeText(getApplicationContext(),"User Name already taken!", Toast.LENGTH_SHORT).show();
                            }
                        }

                        @Override
                        public void onCancelled(DatabaseError error) {

                        }

                    });


                    databaseReference.child("java").child(usernameTxt).child("LessonNo").setValue(usernameTxt);
                    databaseReference.child("java").child(usernameTxt).child("para").setValue(fullnameTxt);
                    databaseReference.child("java").child(usernameTxt).child("quiz").setValue(emailTxt);
                    databaseReference.child("java").child(usernameTxt).child("problems").setValue(passwordTxt);

                    Toast.makeText(getApplicationContext(),"Regiatration Successfull", Toast.LENGTH_SHORT).show();
                    Toast.makeText(getApplicationContext(),"Welcome"+usernameTxt+"!", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                    startActivity(intent);
                }

            }


        });
    }
}