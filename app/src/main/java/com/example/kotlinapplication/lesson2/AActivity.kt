package com.example.kotlinapplication.lesson2

import android.os.Bundle
import android.widget.Button
import com.example.kotlinapplication.R

class AActivity : FirstActivity() {

    private lateinit var btnA: Button

    companion object {
        const val SEND_DATA = "SEND_DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnA = findViewById(R.id.btnA)
        btnA.setOnClickListener {
//            startAct(this, BActivity::class.java, object : IStartActivity {
//                override fun onIntent(intent: Intent) {
//                    intent.putExtra(SEND_DATA, "Hello")
//                }
//            })

            startAct(this, BActivity::class.java){

            }
        }
    }
}