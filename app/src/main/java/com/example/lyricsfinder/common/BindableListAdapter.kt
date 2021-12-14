package com.example.lyricsfinder.common

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

abstract class BindableListAdapter<T, VH : RecyclerView.ViewHolder>(
    diffCallBack: DiffUtil.ItemCallback<T>
) : ListAdapter<T, VH>(diffCallBack) {
    lateinit var fragment: Fragment
}