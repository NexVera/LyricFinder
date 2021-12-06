package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Relationships(
    @Json(name = "pinned_role")
    val pinnedRole: Any = Any()
)