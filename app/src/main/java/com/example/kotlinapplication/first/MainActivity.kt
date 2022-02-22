package com.example.kotlinapplication.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotlinapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("check", "onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("check", "onRestart")
    }
    override fun onStart() {
        super.onStart()
        Log.d("check", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("check", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("check", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("check", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("check", "onDestroy")
    }
}