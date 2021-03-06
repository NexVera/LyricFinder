package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class VerifiedContributor(
    @Json(name = "artist")
    val artist: ArtistXX?,
    @Json(name = "contributions")
    val contributions: List<String>?,
    @Json(name = "user")
    val user: UserX?
)