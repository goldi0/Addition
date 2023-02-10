package com.example.addition

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1 = findViewById(R.id.etNumber1) as EditText
        val number2 = findViewById(R.id.etNumber2) as EditText
        val resultTextview = findViewById(R.id.tvResult) as TextView
        val btnSum = findViewById(R.id.btnAdd) as Button

        //button click

        btnSum.setOnClickListener {
            val n1 = number1.text.toString().toInt()
            val n2 = number2.text.toString().toInt()
            val result = n1 + n2
            resultTextview.text = result.toString()

        }
    }
}