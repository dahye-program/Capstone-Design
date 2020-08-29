package com.example.capstonedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    Button signupbtn; //메뉴 바에 있는 회원가입 버튼
    Button loginbtn; //메뉴 바에 있는 로그인 버튼
    Button rentalbtn; //메뉴 바에 있는 대여 버튼
    Button mybtn; //메뉴 바에 있는 내페이지 버튼
    EditText userIDforlogin; // EditText로 입력받는 아이디
    EditText userPWforlogin; // EditText로 입력받는 비밀번호
    Button loginCheckbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signupbtn = (Button)findViewById(R.id.signUpButton); // findViewById 이용하여 메뉴 바에 있는 회원가입 버튼
        loginbtn = (Button)findViewById(R.id.loginButton); // findViewById 이용하여 메뉴 바에 있는 로그인 버튼
        rentalbtn = (Button)findViewById(R.id.rentalButton); // findViewById 이용하여 메뉴 바에 있는 대여 버튼
        mybtn = (Button)findViewById(R.id.myButton); // findViewById 이용하여 메뉴 바에 있는 내페이지 버튼

        userIDforlogin = (EditText)findViewById(R.id.editUserIDforlogin); // 입력받은 사용자 ID
        userPWforlogin = (EditText)findViewById(R.id.editUserPwforlogin); // 입력받은 사용자 PW

        loginCheckbtn = (Button)findViewById(R.id.loginCheckButton); //로그인 확인 버튼

        loginCheckbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //로그인 가능 여부 확인
            }
        });
    }
}