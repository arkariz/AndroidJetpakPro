package com.arrkariz.submissionarchitecturecomponent.ui.tvshows

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.arrkariz.submissionarchitecturecomponent.data.entity.MovieEntity
import com.arrkariz.submissionarchitecturecomponent.data.resource.CatalogueRepository
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.ResultsItem
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.TvShow


class TvshowViewModel(private val catalogueRepository: CatalogueRepository): ViewModel() {
    fun getTvshow(): LiveData<List<TvShow>> = catalogueRepository.getPopularTvShow()
}