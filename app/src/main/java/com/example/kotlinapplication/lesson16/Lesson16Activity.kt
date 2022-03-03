package com.example.kotlinapplication.lesson16

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinapplication.R

class Lesson16Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson16)

        val fragment = Fragment16()
        supportFragmentManager.beginTransaction().replace(R.id.frmLesson116,fragment).commit()
    }
}