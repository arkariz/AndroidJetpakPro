package com.arrkariz.submissionarchitecturecomponent.ui.movies

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.arrkariz.submissionarchitecturecomponent.data.entity.MovieEntity
import com.arrkariz.submissionarchitecturecomponent.data.resource.CatalogueRepository
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.ResultsItem


class MovieViewModel(private val catalogueRepository: CatalogueRepository): ViewModel() {
    fun getMovies():LiveData<List<ResultsItem>> = catalogueRepository.getPopularMovies()
}