package com.example.kotlinapplication.lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlinapplication.R

class Intent2Activity : AppCompatActivity() {

    private lateinit var tv2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        tv2 = findViewById(R.id.tv2)
        tv2.text = intent.getStringExtra(Intent1Activity.SEND_DATA)
    }
}