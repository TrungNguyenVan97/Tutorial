package com.example.kotlinapplication.lesson4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.kotlinapplication.R

class Intent1Activity : AppCompatActivity() {

    companion object {
        const val SEND_DATA = "SEND DATA"
    }

    private lateinit var tv1: TextView
    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)

        tv1 = findViewById(R.id.tv1)
        btnSend = findViewById(R.id.btnSend)
        btnSend.setOnClickListener {
            val intent = Intent(this, Intent2Activity::class.java)
            intent.putExtra(SEND_DATA, tv1.text)
            startActivity(intent)
        }
    }
}