package com.arrkariz.submissionarchitecturecomponent.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.arrkariz.submissionarchitecturecomponent.data.resource.CatalogueRepository
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailMovieResponse
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailTvShowResponse
import kotlin.properties.Delegates

class DetailViewModel(private val catalogueRepository: CatalogueRepository): ViewModel() {
    private var contentId by Delegates.notNull<Int>()

    fun setSelectedContent(contentId: Int) {
        this.contentId = contentId
    }

    fun getDetailMovie(): LiveData<DetailMovieResponse> = catalogueRepository.getDetailMovie(contentId)

    fun getDetailTvShow(): LiveData<DetailTvShowResponse> = catalogueRepository.getDetailTvShow(contentId)
}