package com.arrkariz.submissionarchitecturecomponent.ui.tvshows

import androidx.arch.core.executor.testing.InstantTaskExecutorRule

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.arrkariz.submissionarchitecturecomponent.data.resource.CatalogueRepository
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.ResultsItem
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.TvShow
import com.arrkariz.submissionarchitecturecomponent.utils.ResourceData
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
class TvshowViewModelTest {

    lateinit var viewModel: TvshowViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var catalogueRepository: CatalogueRepository

    @Mock
    private lateinit var observer: Observer<List<TvShow>>

    @Before
    fun setUp() {
        viewModel = TvshowViewModel(catalogueRepository)
    }

    @Test
    fun getTvshow() {
        val dummyTvShow = ResourceData.setTv()
        val tvShow = MutableLiveData<List<TvShow>>()
        tvShow.value = dummyTvShow

        `when`(catalogueRepository.getPopularTvShow()).thenReturn(tvShow)
        val tvShowEntities = viewModel.getTvshow().value
        verify(catalogueRepository).getPopularTvShow()
        assertNotNull(tvShowEntities)
        assertEquals(10, tvShowEntities?.size)

        viewModel.getTvshow().observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}
