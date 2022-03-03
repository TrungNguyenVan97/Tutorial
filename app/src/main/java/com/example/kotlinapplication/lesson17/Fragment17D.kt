package com.example.kotlinapplication.lesson17

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinapplication.R
import com.example.kotlinapplication.lesson17.Fragment17A.Companion.TAG

class Fragment17D : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate:D ")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView:D")
        return inflater.inflate(R.layout.fragment_17d, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated:D ")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(TAG, "onViewStateRestored:D ")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart:D ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume:D ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause:D ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop:D ")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState:D ")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView:D ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy:D ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach:D ")
    }
}