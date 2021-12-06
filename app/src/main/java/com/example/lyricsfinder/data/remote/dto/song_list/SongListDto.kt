package com.example.lyricsfinder.data.remote.dto.song_list


import com.example.lyricsfinder.common.Constants
import com.example.lyricsfinder.domain.model.Song
import com.squareup.moshi.Json

data class SongListDto(
    @Json(name = "meta")
    val meta: Meta?,
    @Json(name = "response")
    val response: Response?
)

fun SongListDto.toSongList(): List<Song>? = response?.hits?.map {
    it.result.let { result ->
        Song(
            result?.id ?: Constants.DEFAULT_VAL_INT,
            result?.title ?: Constants.DEFAULT_VAL_STRING,
            result?.artistNames ?: Constants.DEFAULT_VAL_STRING,
            result?.songArtImageUrl ?: Constants.DEFAULT_VAL_STRING
        )
    }
}