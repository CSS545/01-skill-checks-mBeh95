package com.example.helloworldbuttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        val clicking : Button = findViewById(R.id.buttonBack);
        clicking.setOnClickListener{
            val moveToPageOne = Intent(this, MainActivity::class.java);
            startActivity(moveToPageOne);
        }
    }
}