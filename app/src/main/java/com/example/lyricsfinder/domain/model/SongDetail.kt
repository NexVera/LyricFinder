package com.example.lyricsfinder.domain.model

data class SongDetail(
    val id: Int,
    val title: String,
    val artistNames: String,
    val writerArtists: List<String>,
    val producerArtists: List<String>,
    val releaseDate: String,
    val songArtImageUrl: String,
)