package com.example.capstonedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_main);
        signupbtn = (Button)findViewById(R.id.signUpButton); // findViewById 이용하여 메뉴 바에 있는 회원가입 버튼
        loginbtn = (Button)findViewById(R.id.loginButton); // findViewById 이용하여 메뉴 바에 있는 로그인 버튼
        rentalbtn = (Button)findViewById(R.id.rentalButton); // findViewById 이용하여 메뉴 바에 있는 대여 버튼
        mybtn = (Button)findViewById(R.id.myButton); // findViewById 이용하여 메뉴 바에 있는 내페이지 버튼

        userName = (EditText)findViewById(R.id.editUserName); // findViewById 이용하여 EditText로 입력받는 이름
        userID = (EditText)findViewById(R.id.editUserID); // findViewById 이용하여 EditText로 입력받는 아이디
        userPW = (EditText)findViewById(R.id.editUserPW); // findViewById 이용하여 EditText로 입력받는 비밀번호
        userBirth = (EditText)findViewById(R.id.editUserBirth); // findViewById 이용하여 EditText로 입력받는 생년월일
        userPhone = (EditText)findViewById(R.id.editUserPhone); // findViewById 이용하여 EditText로 입력받는 핸드폰번호

        signUpCheckbtn = (Button)findViewById(R.id.signUpCheckButton); // findViewById 이용하여 회원가입 확인 버튼

        signupbtn.setOnClickListener(new View.OnClickListener() { //메뉴 바에 있는 회원가입 버튼 클릭 시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),signUp.class);
                startActivity(intent);
            }
        });
        loginbtn.setOnClickListener(new View.OnClickListener() { //메뉴 바에 있는 로그인 버튼 클릭 시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);
            }
        });
        rentalbtn.setOnClickListener(new View.OnClickListener() { //메뉴 바에 있는 렌탈 버튼 클릭 시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),rentalMain.class);
                startActivity(intent);
            }
        });
        mybtn.setOnClickListener(new View.OnClickListener() { //메뉴 바에 있는 마이페이지 버튼 클릭 시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),myPageMain.class);
                startActivity(intent);
            }
        });
    }
}