package com.example.kotlinapplication.bottomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.kotlinapplication.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationActivity : AppCompatActivity() {

    private lateinit var bottom: BottomNavigationView
    private val frmHome = HomeFragment()
    private val frmMusic = MusicFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        bottom = findViewById(R.id.bottom_Navigation)

        supportFragmentManager.beginTransaction().add(R.id.frm_Bottom_Navigation, frmHome)
            .commit()

        bottom.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.ic_home -> replaceFragment(frmHome)
                R.id.ic_music -> replaceFragment(frmMusic)
            }
            true
        }
    }

    private fun replaceFragment(f: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frm_Bottom_Navigation, f).commit()
    }
}