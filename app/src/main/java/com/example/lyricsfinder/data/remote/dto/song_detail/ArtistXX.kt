package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class ArtistXX(
    @Json(name = "api_path")
    val apiPath: String,
    @Json(name = "header_image_url")
    val headerImageUrl: String,
    @Json(name = "id")
    val id: Int,
    @Json(name = "image_url")
    val imageUrl: String,
    @Json(name = "iq")
    val iq: Int,
    @Json(name = "is_meme_verified")
    val isMemeVerified: Boolean,
    @Json(name = "is_verified")
    val isVerified: Boolean,
    @Json(name = "name")
    val name: String,
    @Json(name = "url")
    val url: String
)