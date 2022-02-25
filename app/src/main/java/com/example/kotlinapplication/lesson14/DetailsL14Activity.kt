package com.example.kotlinapplication.lesson14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.kotlinapplication.R

class DetailsL14Activity : AppCompatActivity() {

    private lateinit var tvTitle: TextView
    private lateinit var tvPosition: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_l14)
        tvTitle = findViewById(R.id.tvTitle)
        tvPosition = findViewById(R.id.tvPosition)

        val news = intent.getSerializableExtra(Lesson14Activity.SEND_NEWS) as News
        val position = intent.getIntExtra(Lesson14Activity.SEND_POSITION,0)

        tvTitle.text = news.title
        tvPosition.text = position.toString()
    }
}