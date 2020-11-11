package com.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        aMain_text.text = "hello world!!"
        aMain_button.text = "Click!"
        aMain_button.setOnClickListener {
            //Toast.makeText(this, "버튼이 클릭됬어요! 신기한 Listener!", Toast.LENGTH_SHORT).show()
            //aMain_text.text = "버튼이 클릭됬어요!"
            val textView = findViewById<TextView>(R.id.aMain_text)
            if(textView != null) {
                textView.text = "findViewById로 바꿔봤어요"
            }
        }
    }
}