package com.example.kotlinapplication.lesson14

import android.media.ImageReader
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class NewsAdapter(private val listNews: ArrayList<Any>, private val call: ICallBack) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        const val HEADER_TYPE = 1
        const val NEWS_TYPE = 2
    }

    override fun getItemViewType(position: Int): Int {
        return if (listNews[position] is Header) {
            HEADER_TYPE
        } else {
            NEWS_TYPE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == HEADER_TYPE) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.header_news, parent, false)
            HeaderHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.news, parent, false)
            NewsHolder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is HeaderHolder) {
            val headerNews = listNews[position] as Header
            holder.tvHeader.text = headerNews.header
        } else if (holder is NewsHolder) {
            val news = listNews[position] as News
            holder.imvPhoto.setImageResource(news.photo)
            holder.tvContent.text = news.content
            holder.tvType.text = news.type
            holder.tvDate.text = news.date
        }
    }

    override fun getItemCount(): Int {
        return listNews.size
    }

    inner class HeaderHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var tvHeader: TextView = itemView.findViewById(R.id.tvHeader)
    }

    inner class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var imvPhoto: ImageView = itemView.findViewById(R.id.imvPhoto)
        internal var tvContent: TextView = itemView.findViewById(R.id.tvContent)
        internal var tvType: TextView = itemView.findViewById(R.id.tvType)
        internal var tvDate: TextView = itemView.findViewById(R.id.tvDate)
        private var layoutNews: LinearLayout = itemView.findViewById(R.id.layoutNews)

        init {
            initAction()
        }

        private fun initAction() {
            layoutNews.setOnClickListener {
                call?.onClick(adapterPosition)
            }
        }
    }

    interface ICallBack {
        fun onClick(position: Int)
    }
}