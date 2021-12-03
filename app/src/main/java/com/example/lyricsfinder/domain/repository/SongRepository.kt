package com.example.lyricsfinder.domain.repository

import com.example.lyricsfinder.data.remote.dto.song_detail.SongDetailDto
import com.example.lyricsfinder.data.remote.dto.song_list.SongListDto

interface SongRepository {
    suspend fun getSongList(keyword: String): SongListDto

    suspend fun getSongDetail(id: String): SongDetailDto
}