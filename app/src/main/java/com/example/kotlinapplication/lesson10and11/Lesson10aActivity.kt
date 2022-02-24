package com.example.kotlinapplication.lesson10and11

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.kotlinapplication.R

class Lesson10aActivity : AppCompatActivity() {

    companion object {
        const val ACTION_SEND = "ACTION_SEND"
        const val SEND_DATA = "SEND_DATA"
    }

    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson10a)

        btnSend = findViewById(R.id.btnSendBroadcast)
        btnSend.setOnClickListener {
            val intent = Intent(this, MyReceiver::class.java)
            intent.action = ACTION_SEND
            intent.putExtra(SEND_DATA, "Hello World")
            sendBroadcast(intent)
        }
    }
}