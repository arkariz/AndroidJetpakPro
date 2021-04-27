package com.arrkariz.submissionarchitecturecomponent.api

import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    companion object{
        const val apiKey = "c7616764999d6744b148587de71838cc"
    }

    @GET("3/movie/popular?api_key=$apiKey")
    fun getPopularMovies(): Call<MovieResponse>

    @GET("3/tv/popular?api_key=$apiKey")
    fun getPopularTvShow(): Call<TvResponse>

    @GET("3/movie/{id}?api_key=$apiKey")
    fun getDetailMovie(@Path("id") id: Int): Call<DetailMovieResponse>

    @GET("3/tv/{tv_id}?api_key=$apiKey")
    fun getDetailTvShow(@Path("tv_id") tv_id: Int): Call<DetailTvShowResponse>
}