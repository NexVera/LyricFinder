package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class InteractionsX(
    @Json(name = "following")
    val following: Boolean = false
)