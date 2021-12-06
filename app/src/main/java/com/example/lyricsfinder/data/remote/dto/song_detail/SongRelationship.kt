package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class SongRelationship(
    @Json(name = "relationship_type")
    val relationshipType: String?,
    @Json(name = "songs")
    val songs: List<SongX>?,
    @Json(name = "type")
    val type: String?
)