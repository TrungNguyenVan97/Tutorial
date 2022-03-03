package com.example.kotlinapplication.bottomnavigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class PersonAdapter(private val list: ArrayList<Person>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.frm_person_other, parent, false)
        return PersonHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PersonHolder) {
            holder.tvName.text = list[position].name
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class PersonHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var tvName: TextView = itemView.findViewById(R.id.tv_name_other)
    }
}