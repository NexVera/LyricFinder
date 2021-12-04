package com.example.lyricsfinder.domain.use_case

import com.example.lyricsfinder.common.Response
import com.example.lyricsfinder.data.remote.dto.song_detail.toSongDetail
import com.example.lyricsfinder.domain.model.SongDetail
import com.example.lyricsfinder.domain.repository.SongRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject

class GetSongDetailUseCase @Inject constructor(
    private val repository: SongRepository
) {
    operator fun invoke(id: String): Flow<Response<SongDetail>> = flow {
        try {
            emit(Response.Loading())
            repository.getSongDetail(id).apply { emit(Response.Success(this.toSongDetail())) }
        } catch (e: Exception) {
            emit(Response.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
    }
}