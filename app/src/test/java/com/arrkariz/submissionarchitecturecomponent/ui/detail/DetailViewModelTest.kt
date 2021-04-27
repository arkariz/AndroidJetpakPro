package com.arrkariz.submissionarchitecturecomponent.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.arrkariz.submissionarchitecturecomponent.data.entity.MovieEntity
import com.arrkariz.submissionarchitecturecomponent.data.resource.CatalogueRepository
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailMovieResponse
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailTvShowResponse
import com.arrkariz.submissionarchitecturecomponent.ui.tvshows.TvshowViewModel
import com.arrkariz.submissionarchitecturecomponent.utils.ContentDetail
import com.arrkariz.submissionarchitecturecomponent.utils.ResourceData
import com.arrkariz.submissionarchitecturecomponent.utils.TvDetail
import org.junit.Test
import org.junit.Assert.*

import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest {

    lateinit var viewModel: DetailViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observerM: Observer<DetailMovieResponse>

    @Mock
    private lateinit var observerT: Observer<DetailTvShowResponse>

    @Before
    fun setUp() {
        viewModel = DetailViewModel(catalogueRepository)
    }

    @Test
    fun getDetailMovie() {
        val dummyDetailMovie = ContentDetail.setDetail()
        val detailMovie = MutableLiveData<DetailMovieResponse>()
        detailMovie.value = dummyDetailMovie

        `when`(catalogueRepository.getDetailMovie(460465)).thenReturn(detailMovie)
        viewModel.setSelectedContent(460465)
        val detailMovieEntities = viewModel.getDetailMovie().value
        verify(catalogueRepository).getDetailMovie(460465)
        assertNotNull(detailMovieEntities)
        val title = detailMovieEntities?.title
        assertNotNull(title)
        assertEquals("Mortal Kombat", title)

        viewModel.getDetailMovie().observeForever(observerM)
        verify(observerM).onChanged(dummyDetailMovie)
    }

    @Test
    fun getDetailTvShow() {
        val dummyDetailTvshow = TvDetail.setDetail()
        val detailTvshow = MutableLiveData<DetailTvShowResponse>()
        detailTvshow.value = dummyDetailTvshow

        `when`(catalogueRepository.getDetailTvShow(88396)).thenReturn(detailTvshow)
        viewModel.setSelectedContent(88396)
        val detailMovieEntities = viewModel.getDetailTvShow().value
        verify(catalogueRepository).getDetailTvShow(88396)
        assertNotNull(detailMovieEntities)
        val title = detailMovieEntities?.name
        assertNotNull(title)
        assertEquals("The Falcon and the Winter Soldier", title)

        viewModel.getDetailTvShow().observeForever(observerT)
        verify(observerT).onChanged(dummyDetailTvshow)
    }
}
