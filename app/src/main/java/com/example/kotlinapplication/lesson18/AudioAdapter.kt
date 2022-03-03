package com.example.kotlinapplication.lesson18

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class AudioAdapter(private val listAudio: ArrayList<Audio>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.m000_audio18_act, parent, false)
        return AudioHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is AudioHolder) {
            holder.tvTitle.text = listAudio[position].title
            holder.tvArtist.text = listAudio[position].artist
        }
    }

    override fun getItemCount(): Int {
        return listAudio.size
    }

    inner class AudioHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
        internal var tvArtist: TextView = itemView.findViewById(R.id.tvArtist)
    }
}