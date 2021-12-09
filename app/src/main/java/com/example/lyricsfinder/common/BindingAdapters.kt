package com.example.lyricsfinder.common

import android.view.View
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import coil.load
import com.example.lyricsfinder.R

@BindingAdapter("imageUrl")
fun bindImage(view: ImageView, url: String?) {
    url?.let {
        it.toUri().buildUpon().scheme("https").build().apply {
            view.load(this) {
                placeholder(R.drawable.ic_broken_image)
                error(R.drawable.ic_broken_image)
            }
        }
    }
}

@BindingAdapter("isVisible")
fun bindVisibility(view: View, visible: Boolean) {
    when (visible) {
        true -> view.visibility = View.VISIBLE
        false -> view.visibility = View.GONE
    }
}