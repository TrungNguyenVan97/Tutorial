package com.example.kotlinapplication.lesson10and11

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Filter
import android.widget.TextView
import com.example.kotlinapplication.R

class Lesson10bActivity : AppCompatActivity() {

    private lateinit var tvLesson10b: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson10b)

        tvLesson10b = findViewById(R.id.tvLesson10b)

        tvLesson10b.text = intent.getStringExtra(MyReceiver.TO_B)

    }
}