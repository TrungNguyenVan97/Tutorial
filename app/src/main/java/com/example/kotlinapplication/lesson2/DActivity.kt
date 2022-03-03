package com.example.kotlinapplication.lesson2

import android.os.Bundle
import android.widget.Button
import com.example.kotlinapplication.R


class DActivity : SecondActivity() {

    private lateinit var btnD: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dactivity)

        btnD = findViewById(R.id.btnD)
        btnD.setOnClickListener {
            startAct(this, AActivity::class.java)
        }
    }
}