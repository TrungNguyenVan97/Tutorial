package com.example.kotlinapplication.lesson14

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R

class Lesson14Activity : AppCompatActivity(), NewsAdapter.ICallBack {

    private lateinit var rvNews: RecyclerView
    private lateinit var listNews: ArrayList<Any>

    companion object {
        const val SEND_NEWS = "SEND_NEWS"
        const val SEND_POSITION = "SEND_POSITION"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesso14)

        findView()
        getNews()
        initView()
    }

    private fun initView() {
        rvNews.layoutManager = LinearLayoutManager(this)
        rvNews.adapter = NewsAdapter(listNews, this)
    }

    private fun getNews() {
        listNews = arrayListOf()
        listNews.add(Header("LATEST NEWS"))
        listNews.add(
            News(
                "Chào mừng đến với LMHT",
                R.drawable.image_1,
                "Xin chào các kiện tướng, chào mừng các bạn đã đến với bản cập nhật 11.3",
                "Other",
                "08/02/2022"
            )
        )
        listNews.add(
            News(
                "LMHT: CHI TIẾT CẬP NHẬT 11.3",
                R.drawable.image_2,
                "CHI TIẾT CẬP NHẬT 11.3",
                "Video",
                "26/01/2022"
            )
        )
        listNews.add(
            News(
                "LMHT: Bảo trì ",
                R.drawable.image_3,
                "Bảo trì máy chủ",
                "Video",
                "25/01/2022"
            )
        )
    }

    private fun findView() {
        rvNews = findViewById(R.id.rvNews)
    }

    override fun onClick(position: Int) {
        val news = listNews[position] as News
        val intent = Intent(this, DetailsL14Activity::class.java)
        intent.putExtra(SEND_NEWS, news)
        intent.putExtra(SEND_POSITION, position)
        startActivity(intent)
    }
}