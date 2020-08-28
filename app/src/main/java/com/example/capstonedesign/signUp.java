package com.example.capstonedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class signUp extends AppCompatActivity {
    Button signupbtn; //메뉴 바에 있는 회원가입 버튼
    Button loginbtn; //메뉴 바에 있는 로그인 버튼
    Button rentalbtn; //메뉴 바에 있는 대여 버튼
    Button mybtn; //메뉴 바에 있는 내페이지 버튼
    EditText userName; // EditText로 입력받는 이름
    EditText userID; // EditText로 입력받는 아이디
    EditText userPW; // EditText로 입력받는 비밀번호
    EditText userBirth; // EditText로 입력받는 생년월일
    EditText userPhone; // EditText로 입력받는 핸드폰번호
    Button signUpCheckbtn; // 회원가입 확인 버튼

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signupbtn = (Button)findViewById(R.id.signUpButton); //메뉴 바에 있는 회원가입 버튼
        loginbtn = (Button)findViewById(R.id.loginButton); //메뉴 바에 있는 로그인 버튼
        rentalbtn = (Button)findViewById(R.id.rentalButton); //메뉴 바에 있는 대여 버튼
        mybtn = (Button)findViewById(R.id.myButton); //메뉴 바에 있는 내페이지 버튼

        userName = (EditText)findViewById(R.id.editUserName); // EditText로 입력받는 이름
        userID = (EditText)findViewById(R.id.editUserID); // EditText로 입력받는 아이디
        userPW = (EditText)findViewById(R.id.editUserPW); // EditText로 입력받는 비밀번호
        userBirth = (EditText)findViewById(R.id.editUserBirth); // EditText로 입력받는 생년월일
        userPhone = (EditText)findViewById(R.id.editUserPhone); // EditText로 입력받는 핸드폰번호

        signUpCheckbtn = (Button)findViewById(R.id.signUpCheckButton); // 회원가입 확인 버튼
    }
}