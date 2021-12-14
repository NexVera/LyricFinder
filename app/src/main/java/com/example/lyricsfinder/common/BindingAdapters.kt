package com.example.lyricsfinder.common

import android.view.View
import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
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

@BindingAdapter("data")
fun bindDataRecyclerView(recyclerView: RecyclerView, data: List<Any>?) {
    data?.let {
        @Suppress("UNCHECKED_CAST")
        (recyclerView.adapter as? BindableListAdapter<Any, *>)?.submitList(it)
    }
}

@BindingAdapter("fragment")
fun bindFragmentRecyclerView(recyclerView: RecyclerView, fragment: Fragment) {
    (recyclerView.adapter as BindableListAdapter<*, *>).fragment = fragment
}