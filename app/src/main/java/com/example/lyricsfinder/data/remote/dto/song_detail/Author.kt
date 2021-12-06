package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Author(
    @Json(name = "attribution")
    val attribution: Double = 0.0,
    @Json(name = "pinned_role")
    val pinnedRole: Any = Any(),
    @Json(name = "user")
    val user: User = User()
)