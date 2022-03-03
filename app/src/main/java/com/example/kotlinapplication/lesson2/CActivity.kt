package com.example.kotlinapplication.lesson2

import android.os.Bundle
import android.widget.Button
import com.example.kotlinapplication.R

class CActivity : SecondActivity() {

    private lateinit var btnC: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cactivity)

        btnC = findViewById(R.id.btnC)
        btnC.setOnClickListener {
            startAct(this, DActivity::class.java)
        }
    }
}