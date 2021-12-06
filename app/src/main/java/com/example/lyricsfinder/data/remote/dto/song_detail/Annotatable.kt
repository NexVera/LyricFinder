package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Annotatable(
    @Json(name = "api_path")
    val apiPath: String = "",
    @Json(name = "client_timestamps")
    val clientTimestamps: ClientTimestamps = ClientTimestamps(),
    @Json(name = "context")
    val context: String = "",
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "image_url")
    val imageUrl: String = "",
    @Json(name = "link_title")
    val linkTitle: String = "",
    @Json(name = "title")
    val title: String = "",
    @Json(name = "type")
    val type: String = "",
    @Json(name = "url")
    val url: String = ""
)