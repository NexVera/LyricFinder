package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class Stats(
    @Json(name = "hot")
    val hot: Boolean,
    @Json(name = "pageviews")
    val pageviews: Int,
    @Json(name = "unreviewed_annotations")
    val unreviewedAnnotations: Int
)