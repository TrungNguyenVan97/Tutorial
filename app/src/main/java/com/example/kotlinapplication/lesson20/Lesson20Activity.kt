package com.example.kotlinapplication.lesson20

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class Lesson20Activity : AppCompatActivity() {

    private lateinit var edtFind: EditText
    private lateinit var rvSave: RecyclerView
    private var listFind: ArrayList<Find> = TODO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson20)

        findVew()
        listFind = arrayListOf()
    }

    private fun findVew() {
        edtFind = findViewById(R.id.edtFind)
        rvSave = findViewById(R.id.rvSave)
    }
}