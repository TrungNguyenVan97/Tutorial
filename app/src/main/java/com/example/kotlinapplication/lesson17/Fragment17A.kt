package com.example.kotlinapplication.lesson17

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlinapplication.R

class Fragment17A : Fragment() {

    companion object {
        const val TAG = "Fragment17A"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate:A ")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d(TAG, "onCreateView:A")

        return inflater.inflate(R.layout.fragment_17a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated:A ")
    }

//    override fun onViewStateRestored(savedInstanceState: Bundle?) {
//        super.onViewStateRestored(savedInstanceState)
//        Log.d(TAG, "onViewStateRestored:A ")
//    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart:A ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume:A ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause:A ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop:A ")
    }

//    override fun onSaveInstanceState(outState: Bundle) {
//        super.onSaveInstanceState(outState)
//        Log.d(TAG, "onSaveInstanceState:A ")
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView:A ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy:A ")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach:A ")
    }
}