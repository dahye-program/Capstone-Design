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
        signupbtn = (Button)findViewById(R.id.signUpButton); //메뉴 바에 있는 회원가입 버튼
        loginbtn = (Button)findViewById(R.id.loginButton); //메뉴 바에 있는 로그인 버튼
        rentalbtn = (Button)findViewById(R.id.rentalButton); //메뉴 바에 있는 대여 버튼
        mybtn = (Button)findViewById(R.id.myButton); //메뉴 바에 있는 내페이지 버튼


    }
}