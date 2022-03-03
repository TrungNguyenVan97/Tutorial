package com.example.kotlinapplication.lesson15

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MotionEvent
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinapplication.R

class Lesson15Activity : AppCompatActivity() {

    private lateinit var layout: LinearLayout

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson15)

        layout = findViewById(R.id.layoutLesson15)

        layout.setOnClickListener {
            Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show()
        }

        layout.setOnLongClickListener {
            Toast.makeText(this, "Long Click", Toast.LENGTH_SHORT).show()
            true
        }

        layout.setOnTouchListener { v, event ->
            when (event?.action) {
                MotionEvent.ACTION_POINTER_DOWN->
                    Toast.makeText(this, "Down", Toast.LENGTH_SHORT).show()
                MotionEvent.ACTION_POINTER_UP ->
                    Toast.makeText(this, "Up", Toast.LENGTH_SHORT).show()
            }

            v?.onTouchEvent(event) ?: true
        }
    }
}