package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class StatsX(
    @Json(name = "accepted_annotations")
    val acceptedAnnotations: Int?,
    @Json(name = "contributors")
    val contributors: Int?,
    @Json(name = "hot")
    val hot: Boolean?,
    @Json(name = "iq_earners")
    val iqEarners: Int?,
    @Json(name = "pageviews")
    val pageviews: Int?,
    @Json(name = "transcribers")
    val transcribers: Int?,
    @Json(name = "unreviewed_annotations")
    val unreviewedAnnotations: Int?,
    @Json(name = "verified_annotations")
    val verifiedAnnotations: Int?
)