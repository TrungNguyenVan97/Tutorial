package com.example.kotlinapplication.lesson17

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.kotlinapplication.R
import com.example.kotlinapplication.lesson2.BaseActivity

class Lesson17Activity : BaseActivity() {

    private lateinit var btnToB: Button
    private lateinit var btnToC: Button
    private lateinit var btnToD: Button
    private lateinit var btnToA: Button
    private val fragment17a = Fragment17A()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson17)

        supportFragmentManager.beginTransaction().replace(R.id.frmL17, fragment17a).commit()

        Log.d(TAG, "onCreate: ${fragmentManager.backStackEntryCount}")

        btnToB = findViewById(R.id.btnToB)
        btnToC = findViewById(R.id.btnToC)
        btnToD = findViewById(R.id.btnToD)
        btnToA = findViewById(R.id.btnToA)

//        btnToB.setOnClickListener {
//            replaceFragment(Fragment17B())
//        }
//
//        btnToC.setOnClickListener {
//            replaceFragment(Fragment17C())
//        }
//
//        btnToD.setOnClickListener {
//            replaceFragment(Fragment17D())
//        }
//
//        btnToA.setOnClickListener {
//            replaceFragment(Fragment17A())
//        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.clear()
    }

    private fun replaceFragment(frm: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frmL17, frm).commit()
    }
}