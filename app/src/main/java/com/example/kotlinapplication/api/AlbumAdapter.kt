package com.example.kotlinapplication.api

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlinapplication.R

class AlbumAdapter(private val list: ArrayList<AlbumItem>, private val context: Context) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (CallAPIActivity.isCheckedLayoutManager) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.api_call_grind, parent, false)
            GrindHolder(view)
        } else {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.api_call, parent, false)
            Holder(view)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is Holder) {
            holder.tvAlbumID.text = "AlbumID: ${list[position].albumID}"
            holder.tvID.text = "ID: ${list[position].id}"
            holder.tvTitle.text = "Title: ${list[position].title}"

            Glide.with(context).load(list[position].url).fitCenter().error(R.drawable.ic_music)
                .into(holder.ivUrl)

        } else if (holder is GrindHolder) {
            holder.tvGrindAlbumID.text = "AlbumID: ${list[position].albumID}"
            holder.tvGrindID.text = "ID: ${list[position].id}"
            holder.tvGrindTitle.text = "Title: ${list[position].title}"

            Glide.with(context).load(list[position].url).fitCenter().error(R.drawable.ic_music)
                .into(holder.ivGrindUrl)
        }
    }

    override fun getItemCount(): Int = list.size

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var tvAlbumID: TextView = itemView.findViewById(R.id.tv_AlbumID)
        internal var tvID: TextView = itemView.findViewById(R.id.tv_ID)
        internal var tvTitle: TextView = itemView.findViewById(R.id.tv_Title)
        internal var ivUrl: ImageView = itemView.findViewById(R.id.iv_URL)
    }

    inner class GrindHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var tvGrindAlbumID: TextView = itemView.findViewById(R.id.tv_Grind_AlbumID)
        internal var tvGrindID: TextView = itemView.findViewById(R.id.tv_Grind_ID)
        internal var tvGrindTitle: TextView = itemView.findViewById(R.id.tv_Grind_Title)
        internal var ivGrindUrl: ImageView = itemView.findViewById(R.id.iv_Grind_URL)
    }
}