package com.example.kotlinapplication.lesson17

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinapplication.R
import com.example.kotlinapplication.lesson17.Fragment17A.Companion.TAG

class Fragment17C : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate:C ")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView:C")
        return inflater.inflate(R.layout.fragment_17c, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated:C ")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "onViewStateRestored:C ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart:C ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume:C ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause:C ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop:C ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState:C ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView:C ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy:C ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach:C ")
    }
}