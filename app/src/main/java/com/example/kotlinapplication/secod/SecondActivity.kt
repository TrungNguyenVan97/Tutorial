package com.example.kotlinapplication.secod

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinapplication.R

class SecondActivity : AppCompatActivity() {

    private lateinit var btnA: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d("check", "A onCreate")

        btnA = findViewById(R.id.btnA)
        btnA.setOnClickListener {
            val intent = Intent(this, BActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("check", "A onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("check", "A onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("check", "A onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("check", "A onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("check", "A onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("check", "A onDestroy")
    }


}