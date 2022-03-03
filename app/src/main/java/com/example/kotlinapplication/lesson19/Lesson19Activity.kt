package com.example.kotlinapplication.lesson19

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinapplication.R

class Lesson19Activity : AppCompatActivity() {

    private lateinit var edtName: EditText
    private lateinit var edtPhone: EditText
    private lateinit var btnAdd: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson19)

        findView()
    }

    private fun findView() {
        edtName = findViewById(R.id.edtName)
        edtPhone = findViewById(R.id.edtPhone)
        btnAdd = findViewById(R.id.btnAddContact)
    }
}