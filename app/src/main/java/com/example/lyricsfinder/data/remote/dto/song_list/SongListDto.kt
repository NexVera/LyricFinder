package com.example.lyricsfinder.data.remote.dto.song_list


import com.example.lyricsfinder.domain.model.Song
import com.squareup.moshi.Json

data class SongListDto(
    @Json(name = "meta")
    val meta: Meta,
    @Json(name = "response")
    val response: Response
)

fun SongListDto.toSongList(): List<Song> = response.hits.map {
    it.result.let { result ->
        Song(
            result.id,
            result.title,
            result.artistNames,
            result.songArtImageUrl
        )
    }
}

