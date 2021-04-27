package com.arrkariz.submissionarchitecturecomponent.data.resource

import androidx.lifecycle.LiveData
import com.arrkariz.submissionarchitecturecomponent.data.entity.MovieEntity
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailMovieResponse
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailTvShowResponse
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.ResultsItem
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.TvShow

interface CatalogueDataSource {
    fun getPopularMovies(): LiveData<List<ResultsItem>>

    fun getPopularTvShow(): LiveData<List<TvShow>>

    fun getDetailMovie(movieId: Int): LiveData<DetailMovieResponse>

    fun getDetailTvShow(tvId: Int): LiveData<DetailTvShowResponse>
}