package com.example.kotlinapplication.api

data class AlbumItem(
    var albumID: Int,
    var id: Int,
    var title: String,
    var url: String,
    var thumbnailUrl: String
) {
}