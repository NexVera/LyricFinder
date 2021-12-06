package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class ClientTimestamps(
    @Json(name = "lyrics_updated_at")
    val lyricsUpdatedAt: Int = 0,
    @Json(name = "updated_by_human_at")
    val updatedByHumanAt: Int = 0
)