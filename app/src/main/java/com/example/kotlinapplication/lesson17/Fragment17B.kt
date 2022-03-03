package com.example.kotlinapplication.lesson17

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinapplication.R
import com.example.kotlinapplication.lesson17.Fragment17A.Companion.TAG

class Fragment17B : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate:B ")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView:B")
        return inflater.inflate(R.layout.fragment_17b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated:B ")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "onViewStateRestored:B ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart:B ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume:B ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause:B ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop:B ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState:A ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView:B ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy:B ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach:B ")
    }
}