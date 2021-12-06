package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Album(
    @Json(name = "api_path")
    val apiPath: String = "",
    @Json(name = "artist")
    val artist: Artist = Artist(),
    @Json(name = "cover_art_url")
    val coverArtUrl: String = "",
    @Json(name = "full_title")
    val fullTitle: String = "",
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "name")
    val name: String = "",
    @Json(name = "url")
    val url: String = ""
)