package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Accept(
    @Json(name = "primary")
    val primary: PrimaryX = PrimaryX()
)