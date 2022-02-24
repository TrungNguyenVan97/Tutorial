package com.example.kotlinapplication.lesson12and13

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class Adapter(private val listHello: ArrayList<Hello>, private val callBack: IClick) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.hello_list, parent, false)
        return HelloHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is HelloHolder) {
            holder.tvHello.text = listHello[position].hello
        }
    }

    override fun getItemCount(): Int {
        return listHello.size
    }

    inner class HelloHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var tvHello: TextView = itemView.findViewById(R.id.tvHello)
        private val layoutHello: LinearLayout = itemView.findViewById(R.id.layoutHello)

        init {
            onClick()
        }

        private fun onClick() {
            layoutHello.setOnClickListener {
                if (adapterPosition != RecyclerView.NO_POSITION) callBack.delete(adapterPosition)
            }
        }
    }

    interface IClick {
        fun delete(position: Int)
    }
}