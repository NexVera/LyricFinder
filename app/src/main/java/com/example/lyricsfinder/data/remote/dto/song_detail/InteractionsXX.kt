package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class InteractionsXX(
    @Json(name = "cosign")
    val cosign: Boolean?,
    @Json(name = "pyong")
    val pyong: Boolean?,
    @Json(name = "vote")
    val vote: Any?
)