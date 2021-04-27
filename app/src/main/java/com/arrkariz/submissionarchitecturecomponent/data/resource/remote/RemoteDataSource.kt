package com.arrkariz.submissionarchitecturecomponent.data.resource.remote

import android.util.Log
import com.arrkariz.submissionarchitecturecomponent.api.ApiConfig
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.*
import com.arrkariz.submissionarchitecturecomponent.utils.EspressoIdlingResource
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource() {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null
    }

    fun getPopularMovies(callback: PopularMovieCallback){
        EspressoIdlingResource.increment()
        val client = ApiConfig.getApiService().getPopularMovies()
        client.enqueue(object : Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                if (response.isSuccessful) {
                    EspressoIdlingResource.decrement()
                    return callback.onAllMovieReceived(response.body()!!.results)
                } else {
                    EspressoIdlingResource.decrement()
                    Log.e("ApiError", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                EspressoIdlingResource.decrement()
                Log.e("ApiError", "${t.message}")
            }
        })
    }

    fun getPopularTvShow(callback: PopularTvshowCallback) {
        EspressoIdlingResource.increment()
        val client = ApiConfig.getApiService().getPopularTvShow()
        client.enqueue(object : Callback<TvResponse> {
            override fun onResponse(call: Call<TvResponse>, response: Response<TvResponse>) {
                if (response.isSuccessful) {
                    EspressoIdlingResource.decrement()
                    return callback.onAllTvshowReceived(response.body()!!.results)
                } else {
                    EspressoIdlingResource.decrement()
                    Log.e("ApiError", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<TvResponse>, t: Throwable) {
                EspressoIdlingResource.decrement()
                Log.e("ApiError", "${t.message}")
            }
        })
    }

    fun getDetailMovie(movieId: Int, callback: DetailMovieCallback) {
        EspressoIdlingResource.increment()
        val client = ApiConfig.getApiService().getDetailMovie(movieId)
        client.enqueue(object : Callback<DetailMovieResponse> {
            override fun onResponse(call: Call<DetailMovieResponse>, response: Response<DetailMovieResponse>) {
                if (response.isSuccessful) {
                    EspressoIdlingResource.decrement()
                    return callback.onDetailMovieReceived(response.body()!!)
                } else {
                    EspressoIdlingResource.decrement()
                    Log.e("ApiError", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<DetailMovieResponse>, t: Throwable) {
                EspressoIdlingResource.decrement()
                Log.e("ApiError", "${t.message}")
            }
        })
    }

    fun getDetailTvShow(tvId: Int, callback: DetailTvshowCallback) {
        EspressoIdlingResource.increment()
        val client = ApiConfig.getApiService().getDetailTvShow(tvId)
        client.enqueue(object : Callback<DetailTvShowResponse> {
            override fun onResponse(call: Call<DetailTvShowResponse>, response: Response<DetailTvShowResponse>) {
                if (response.isSuccessful) {
                    EspressoIdlingResource.decrement()
                    return callback.onDetailTvshowReceived(response.body()!!)
                } else {
                    EspressoIdlingResource.decrement()
                    Log.e("ApiError", "onFailure: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<DetailTvShowResponse>, t: Throwable) {
                EspressoIdlingResource.decrement()
                Log.e("ApiError", "${t.message}")
            }
        })
    }

    interface PopularMovieCallback{
        fun onAllMovieReceived(movieResponse: List<ResultsItem>)
    }

    interface PopularTvshowCallback{
        fun onAllTvshowReceived(tvShowResponse: List<TvShow>)
    }

    interface DetailMovieCallback{
        fun onDetailMovieReceived(detailResponse: DetailMovieResponse)
    }

    interface DetailTvshowCallback{
        fun onDetailTvshowReceived(detailTvResponse: DetailTvShowResponse)
    }
}