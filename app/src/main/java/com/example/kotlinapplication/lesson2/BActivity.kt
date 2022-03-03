package com.example.kotlinapplication.lesson2

import android.os.Bundle
import android.widget.Button
import com.example.kotlinapplication.R

class BActivity : FirstActivity() {

    private lateinit var btnB: Button

    companion object {
        private const val TAG = "BActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bactivity)

        btnB = findViewById(R.id.btnB)
        btnB.setOnClickListener {
            startAct(this, CActivity::class.java)
        }
    }

}