package com.lesson1
/*
* Author : youngchil cho
* Email : chc07ktm@naver.com
* Description : Android 개발을 위한 기초 레슨1
* Memo :
* 1. Activity와 Layout을 연결해 보세요.
* 2. layout에 id를 할당하고 연결해 보세요
* 3. kotlin-extensions을 이용해서 개발환경을 편하게 셋팅해 보세요.
* 4. Button에 클릭 이벤트를 연결해 보세요
* */

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.i_category.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        aMain_text.text = "hello world!!"
        aMain_button.text = "Click!"
        aMain_button.setOnClickListener {
            //Toast.makeText(this, "버튼이 클릭됬어요! 신기한 Listener!", Toast.LENGTH_SHORT).show()
            //aMain_text.text = "버튼이 클릭됬어요!"
            /*
            val textView = findViewById<TextView>(R.id.aMain_text)
            if(textView != null) {
                textView.text = "findViewById로 바꿔봤어요"
            }
            */
            val value = iCategory_edit.text
            Toast.makeText(this, value, Toast.LENGTH_SHORT).show()
        }
    }
}