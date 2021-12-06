package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class StatsX(
    @Json(name = "accepted_annotations")
    val acceptedAnnotations: Int = 0,
    @Json(name = "concurrents")
    val concurrents: Int = 0,
    @Json(name = "contributors")
    val contributors: Int = 0,
    @Json(name = "hot")
    val hot: Boolean = false,
    @Json(name = "iq_earners")
    val iqEarners: Int = 0,
    @Json(name = "pageviews")
    val pageviews: Int = 0,
    @Json(name = "transcribers")
    val transcribers: Int = 0,
    @Json(name = "unreviewed_annotations")
    val unreviewedAnnotations: Int = 0,
    @Json(name = "verified_annotations")
    val verifiedAnnotations: Int = 0
)