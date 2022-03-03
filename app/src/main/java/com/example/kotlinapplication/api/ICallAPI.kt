package com.example.kotlinapplication.api

import retrofit2.Call
import retrofit2.http.GET

interface ICallAPI {

    @GET("/photos")
    fun getData(): Call<List<AlbumItem>>
}