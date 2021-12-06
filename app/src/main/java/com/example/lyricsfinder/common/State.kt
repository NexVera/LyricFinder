package com.example.lyricsfinder.common

data class State<T>(
    val isLoading: Boolean = false,
    val data: T? = null,
    val error: String = ""
)
