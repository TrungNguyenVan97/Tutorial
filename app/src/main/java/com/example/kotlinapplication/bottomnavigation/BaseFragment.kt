package com.example.kotlinapplication.bottomnavigation

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {

    companion object {
        var TAG = "${this::class.java.simpleName}"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate: ${this::class.java.simpleName}")
    }

/*    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView: ${this::class.java.simpleName}")
        return inflater.inflate(R.layout.frm_base_orther, container, false)
    }*/

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated: ${this::class.java.simpleName}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${this::class.java.simpleName}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume:${this::class.java.simpleName} ")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause:${this::class.java.simpleName} ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ${this::class.java.simpleName}")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView: ${this::class.java.simpleName}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ${this::class.java.simpleName}")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "onDetach: ${this::class.java.simpleName}")
    }
}