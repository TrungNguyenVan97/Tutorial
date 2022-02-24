package com.example.kotlinapplication.lesson5

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ActivityCompat
import com.example.kotlinapplication.R

class Bai5Activity : AppCompatActivity() {

    companion object {
        const val REQUEST_CODE = 1
    }

    private lateinit var edtSDT: EditText
    private lateinit var btnCall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bai5)

        edtSDT = findViewById(R.id.edtSDT)
        btnCall = findViewById(R.id.btnCall)

        btnCall.setOnClickListener {

            // kiểm tra cấp quyền
            if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CALL_PHONE), REQUEST_CODE)
            } else {
                callPhone()
            }
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == REQUEST_CODE) callPhone()
    }

    private fun callPhone() {
        if (edtSDT.text.toString().isNotBlank()) {
            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + edtSDT.text.toString().trim()));
            startActivity(intent)
        }
    }
}