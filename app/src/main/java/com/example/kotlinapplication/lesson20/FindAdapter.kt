package com.example.kotlinapplication.lesson20

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class FindAdapter(private val listFind: ArrayList<Find>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.m000_find_act, parent, false)
        return FindHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is FindHolder) {
            holder.tvHistory.text = listFind[position].find
        }
    }

    override fun getItemCount(): Int {
        return listFind.size
    }

    inner class FindHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var tvHistory: TextView = itemView.findViewById(R.id.tvHistory)
    }
}