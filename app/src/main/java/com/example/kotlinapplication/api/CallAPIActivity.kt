package com.example.kotlinapplication.api

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinapplication.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CallAPIActivity : AppCompatActivity() {

    private val list: ArrayList<AlbumItem> = arrayListOf()
    private lateinit var rvAlbum: RecyclerView
    private lateinit var btnLayout: Button
    private val adapter: AlbumAdapter by lazy { AlbumAdapter(list, this) }
    private val grindLayoutManager: RecyclerView.LayoutManager by lazy {
        GridLayoutManager(
            this,
            3,
            RecyclerView.VERTICAL,
            false
        )
    }
    private val linearLayoutManager: RecyclerView.LayoutManager by lazy { LinearLayoutManager(this) }

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com"
        var isCheckedLayoutManager = false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call_apiactivity)

        rvAlbum = findViewById(R.id.rv_Album)
        btnLayout = findViewById(R.id.btnLayoutManager)
        rvAlbum.layoutManager = linearLayoutManager
        getAlbum()
        rvAlbum.adapter = adapter
        initAction()
    }

    private fun initAction() {
        btnLayout.setOnClickListener {
            if (!isCheckedLayoutManager) {
                rvAlbum.layoutManager = grindLayoutManager
                isCheckedLayoutManager = true
            } else {
                rvAlbum.layoutManager = linearLayoutManager
                isCheckedLayoutManager = false
            }
            rvAlbum.adapter = adapter
        }
    }

    private fun getAlbum() {
        val retrofit =
            Retrofit.Builder().addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL).build().create(ICallAPI::class.java)

        val data = retrofit.getData()
        data.enqueue(object : Callback<List<AlbumItem>> {
            @SuppressLint("NotifyDataSetChanged")
            override fun onResponse(
                call: Call<List<AlbumItem>>,
                response: Response<List<AlbumItem>>
            ) {
                val responseBody = response.body()
                if (responseBody != null) {
                    list.addAll(responseBody)
                    adapter.notifyDataSetChanged()
                }
            }

            override fun onFailure(call: Call<List<AlbumItem>>, t: Throwable) {
            }
        })
    }
}