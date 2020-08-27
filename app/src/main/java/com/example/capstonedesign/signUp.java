package com.example.capstonedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class signUp extends AppCompatActivity {
    Button signupbtn;
    Button loginbtn;
    Button rentalbtn;
    Button mybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signupbtn = (Button)findViewById(R.id.signUpButton);
        loginbtn = (Button)findViewById(R.id.loginButton);
        rentalbtn = (Button)findViewById(R.id.rentalButton);
        mybtn = (Button)findViewById(R.id.myButton);


    }
}