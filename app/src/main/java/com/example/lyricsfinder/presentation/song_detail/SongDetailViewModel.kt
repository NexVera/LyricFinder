package com.example.lyricsfinder.presentation.song_detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.lyricsfinder.common.Constants
import com.example.lyricsfinder.common.Response
import com.example.lyricsfinder.common.State
import com.example.lyricsfinder.domain.model.SongDetail
import com.example.lyricsfinder.domain.use_case.GetSongDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class SongDetailViewModel @Inject constructor(
    private val getSongDetailUseCase: GetSongDetailUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state: MutableStateFlow<State<SongDetail>> = MutableStateFlow(State())
    val state = _state.asStateFlow()

    init {
        // Get the passed song id from SongListFragment
        savedStateHandle.get<String>(Constants.PARAM_SONG_ID)?.let {
            getSongDetail(it)
        }
    }

    private fun getSongDetail(id: String) {
        getSongDetailUseCase(id).onEach {
            when (it) {
                is Response.Loading -> _state.value = State(isLoading = true)
                is Response.Success -> _state.value = State(data = it.data)
                is Response.Error -> _state.value = State(error = it.message ?: Constants.MSG_UNEXPECTED_ERROR)
            }
        }.launchIn(viewModelScope)
    }
}