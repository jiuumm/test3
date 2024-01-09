package com.example.test3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.test3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //확인버튼이 눌리면? 이벤트 달아주자
    binding.loginBtn.setOnClickListener{
        //아이디 입력값, 비번 입력값을 각각의 변수에 저장
        //두개의 변수에 들어있는 값 검사. (맞는 아이디?비번?)
        //맞을때=> 틀릴때 분기처리
        val name = "chab"
        val inputId = binding.idEdt.text.toString()
        val inputPw = binding.passwordEdt.text.toString()
        //아이디도 맞고, 비번도 맞아야함 => 그래야 관리자.
        if(inputId=="admin@test.com"&& inputPw=="qwer"){
            //둘다 맞다면 관리자입니다. 토스트
            Toast.makeText(this, "${name}관리자가 맞습니다!", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "관리자가 아닙니다", Toast.LENGTH_SHORT).show()
        }
        binding.moveToOtherBtn

    }
    }



}