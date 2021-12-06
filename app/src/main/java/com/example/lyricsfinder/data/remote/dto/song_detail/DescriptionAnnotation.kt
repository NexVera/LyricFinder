package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class DescriptionAnnotation(
    @Json(name = "annotatable")
    val annotatable: Annotatable?,
    @Json(name = "annotations")
    val annotations: List<Annotation>?,
    @Json(name = "annotator_id")
    val annotatorId: Int?,
    @Json(name = "annotator_login")
    val annotatorLogin: String?,
    @Json(name = "api_path")
    val apiPath: String?,
    @Json(name = "classification")
    val classification: String?,
    @Json(name = "fragment")
    val fragment: String?,
    @Json(name = "id")
    val id: Int?,
    @Json(name = "is_description")
    val isDescription: Boolean?,
    @Json(name = "path")
    val path: String?,
    @Json(name = "range")
    val range: Range?,
    @Json(name = "song_id")
    val songId: Int?,
    @Json(name = "_type")
    val type: String?,
    @Json(name = "url")
    val url: String?,
    @Json(name = "verified_annotator_ids")
    val verifiedAnnotatorIds: List<Any>?
)