package com.example.kotlinapplication.bottomnavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinapplication.R

class MusicFragment : BaseFragment() {

    companion object {
        const val TAG = "MusicFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_music, container, false)
    }

}