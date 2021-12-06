package com.example.lyricsfinder.data.remote.dto.song_detail


import com.squareup.moshi.Json

data class SongX(
    @Json(name = "annotation_count")
    val annotationCount: Int?,
    @Json(name = "api_path")
    val apiPath: String?,
    @Json(name = "artist_names")
    val artistNames: String?,
    @Json(name = "full_title")
    val fullTitle: String?,
    @Json(name = "header_image_thumbnail_url")
    val headerImageThumbnailUrl: String?,
    @Json(name = "header_image_url")
    val headerImageUrl: String?,
    @Json(name = "id")
    val id: Int?,
    @Json(name = "lyrics_owner_id")
    val lyricsOwnerId: Int?,
    @Json(name = "lyrics_state")
    val lyricsState: String?,
    @Json(name = "path")
    val path: String?,
    @Json(name = "primary_artist")
    val primaryArtist: PrimaryArtistX?,
    @Json(name = "pyongs_count")
    val pyongsCount: Any?,
    @Json(name = "song_art_image_thumbnail_url")
    val songArtImageThumbnailUrl: String?,
    @Json(name = "song_art_image_url")
    val songArtImageUrl: String?,
    @Json(name = "stats")
    val stats: Stats?,
    @Json(name = "title")
    val title: String?,
    @Json(name = "title_with_featured")
    val titleWithFeatured: String?,
    @Json(name = "url")
    val url: String?
)