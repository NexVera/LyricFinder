package com.example.lyricsfinder.data.remote.dto.song_list


import com.squareup.moshi.Json

data class Response(
    @Json(name = "hits")
    val hits: List<Hit>
)