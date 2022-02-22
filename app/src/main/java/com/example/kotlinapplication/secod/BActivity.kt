package com.example.kotlinapplication.secod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.kotlinapplication.R

class BActivity : AppCompatActivity() {

    private lateinit var btnB: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bactivity)

        Log.d("check", "B onCreate")

        btnB = findViewById(R.id.btnB)
        btnB.setOnClickListener {
            val intent = Intent(this, CActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("check", "B onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("check", "B onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("check", "B onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("check", "B onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("check", "B onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("check", "B onDestroy")
    }
}