package com.fina.appmovie.utils

import android.content.Context
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.fina.appmovie.R


const val API_KEY = "876831f0eeb7eff36c6763ddde5eee74"
const val BASE_URL = "https://api.themoviedb.org/3/"

const val BASE_URL_API_IMAGE = "https://image.tmdb.org/t/p/"
const val POSTER_SIZE_W185 = "w185"
const val POSTER_SIZE_W780 = "w780"

fun ImageView.loadImageMovie(url: Any?){
    Glide.with(this.context)
        .load(url)
        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading_movie))
        .into(this)
}

fun ImageView.loadImageTvShow(url: Any?){
    Glide.with(this.context)
        .load(url)
        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading_tvshow))
        .into(this)
}

fun Context.showToast(message: String){
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}