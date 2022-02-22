package com.example.kotlinapplication.secod

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.kotlinapplication.R

class CActivity : AppCompatActivity() {

    private lateinit var btnC: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cactivity)

        Log.d("check", "C onCreate")

        btnC = findViewById(R.id.btnC)
        btnC.setOnClickListener {
            val intent = Intent(this, DActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("check", "C onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d("check", "C onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("check", "C onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("check", "C onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("check", "C onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("check", "C onDestroy")
    }
}