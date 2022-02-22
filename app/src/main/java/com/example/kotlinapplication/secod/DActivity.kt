package com.example.kotlinapplication.secod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.kotlinapplication.R

class DActivity : AppCompatActivity() {

    private lateinit var btnD: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dactivity)

        Log.d("check", "D onCreate")

        btnD = findViewById(R.id.btnD)
        btnD.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("check", "D onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("check", "D onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("check", "D onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("check", "D onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("check", "D onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("check", "D onDestroy")
    }
}