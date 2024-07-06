package com.fina.appmovie.data.api

import com.fina.appmovie.data.model.ListResponse
import com.fina.appmovie.data.model.MovieResponse
import com.fina.appmovie.data.model.TvShowResponse
import com.fina.appmovie.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("movie/now_playing")
    fun getMovies(
        @Query("api_key") apiKey: String = API_KEY
    ): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today")
    fun getTvShow(
        @Query("api_key") apiKey: String = API_KEY
    ): Call<ListResponse<TvShowResponse>>

}
