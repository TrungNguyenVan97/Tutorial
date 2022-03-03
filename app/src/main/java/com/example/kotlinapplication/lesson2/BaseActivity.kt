package com.example.kotlinapplication.lesson2

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    companion object {
        var TAG = "${this::class.java.simpleName}"
    }

    private fun getMakeColor(i: (String) -> String, j: (Int) -> Unit) {
    }

    /* fun getMakeColor(i: (String, String) -> String) {
     }*/
//
//    fun getColor(i: (String, String, Int) -> Int) {
//    }

    /*   @JvmName("getColor1")
       fun getColor(i: (String, Int) -> Unit) {
       }*/

//    fun startAct(a: Activity, b: Class<out Activity>, i: IStartActivity? = null) {
//        val intent = Intent(a, b)
//        i?.onIntent(intent)
//        a.startActivity(intent)
//    }

    fun startAct(a: Activity, b: Class<out Activity>, i: ((Intent) -> Unit)?=null) {
        val intent = Intent(a, b)
        i?.invoke(intent)
        a.startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ${this::class.java.simpleName}")
//        var color = fun(i: String): String { return i }
        /*   getMakeColor { a: String, _: String -> a }
           getMakeColor { _: String -> "" }
           getMakeColor { String -> String}*/

        getMakeColor({ a: String -> a }, { a: Int -> })


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${this::class.java.simpleName}")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ${this::class.java.simpleName}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ${this::class.java.simpleName}")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ${this::class.java.simpleName}")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop:${this::class.java.simpleName}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ${this::class.java.simpleName}")
    }
}