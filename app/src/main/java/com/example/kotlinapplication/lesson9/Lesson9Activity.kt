package com.example.kotlinapplication.lesson9

import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.kotlinapplication.R

class Lesson9Activity : AppCompatActivity() {

    private lateinit var btnOn: Button
    private lateinit var btnOff: Button
    private lateinit var wifiManager: WifiManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson9)

        wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager

        findView()
        initAction()
    }

    private fun initAction() {
        btnOn.setOnClickListener {
            wifiManager.isWifiEnabled = true
            Toast.makeText(this, "Wifi On", Toast.LENGTH_SHORT).show()
        }

        btnOff.setOnClickListener {
            wifiManager.isWifiEnabled = false
            Toast.makeText(this, "Wifi Off", Toast.LENGTH_SHORT).show()
        }
    }

    private fun findView() {
        btnOn = findViewById(R.id.btnOn)
        btnOff = findViewById(R.id.btnOff)
    }
}