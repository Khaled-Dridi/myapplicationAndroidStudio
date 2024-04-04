package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val receivedValue = intent.getIntExtra("correctAnswers",0)
        var tvScore: TextView? = null
        tvScore=findViewById(R.id.tv_score)
        tvScore.text="Your Score is $receivedValue out of 11"
    }
}