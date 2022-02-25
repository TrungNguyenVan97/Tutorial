package com.example.kotlinapplication.lesson14

import java.io.Serializable

data class News(
    var title: String,
    var photo: Int,
    var content: String,
    var type: String,
    var date: String
) : Serializable
