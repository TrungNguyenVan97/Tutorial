package com.example.kotlinapplication.lesson10and11

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK

class MyReceiver : BroadcastReceiver() {

    companion object {
        const val TO_B = "TO_B"
    }

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null && context != null) {
            if (Lesson10aActivity.ACTION_SEND == intent.action) {
                val str = intent.getStringExtra(Lesson10aActivity.SEND_DATA)
                val toB = Intent(context, Lesson10bActivity::class.java)
                toB.flags = FLAG_ACTIVITY_NEW_TASK
                toB.putExtra(TO_B, str)
                context.startActivities(arrayOf(toB))
            }
        }
    }
}