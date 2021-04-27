package com.arrkariz.submissionarchitecturecomponent.data.resource

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.arrkariz.submissionarchitecturecomponent.LiveDataTestUtil
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.RemoteDataSource
import com.arrkariz.submissionarchitecturecomponent.utils.ContentDetail
import com.arrkariz.submissionarchitecturecomponent.utils.ResourceData
import com.arrkariz.submissionarchitecturecomponent.utils.TvDetail
import com.nhaarman.mockitokotlin2.any
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito
import org.mockito.Mockito.*

class CatalogueRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val catalogueRepository = FakeCatalogueRepository(remote)
    private val dummyMovie = ResourceData.setMovies()
    private val dummyTv = ResourceData.setTv()
    private val dummyDetailMovie = ContentDetail.setDetail()
    private val dummyDetailTv = TvDetail.setDetail()

    @Test
    fun getPopularMovies() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.PopularMovieCallback)
                .onAllMovieReceived(dummyMovie)
            null
        }.`when`(remote).getPopularMovies(any())
        val movieEntities = LiveDataTestUtil.getValue(catalogueRepository.getPopularMovies())
        verify(remote).getPopularMovies(any())
        assertNotNull(movieEntities)
        assertEquals(dummyMovie.size.toLong(), movieEntities.size.toLong())
        assertEquals(dummyMovie[0].title, movieEntities[0].title)
    }

    @Test
    fun getPopularTvShow() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.PopularTvshowCallback)
                .onAllTvshowReceived(dummyTv)
            null
        }.`when`(remote).getPopularTvShow(any())
        val tvEntities = LiveDataTestUtil.getValue(catalogueRepository.getPopularTvShow())
        verify(remote).getPopularTvShow(any())
        assertNotNull(tvEntities)
        assertEquals(dummyTv.size.toLong(), tvEntities.size.toLong())
        assertEquals(dummyTv[0].name, tvEntities[0].name)
    }

    @Test
    fun getDetailMovie() {
        doAnswer { invocation ->
            (invocation.arguments[1] as RemoteDataSource.DetailMovieCallback)
                .onDetailMovieReceived(dummyDetailMovie)
            null
        }.`when`(remote).getDetailMovie(eq(460465),any())
        val detailMovieEntities = LiveDataTestUtil.getValue(catalogueRepository.getDetailMovie(460465))
        verify(remote).getDetailMovie(eq(460465), any())
        assertNotNull(detailMovieEntities)
        assertEquals(dummyDetailMovie.title, detailMovieEntities.title)
        assertEquals(dummyDetailMovie.releaseDate, detailMovieEntities.releaseDate)
    }

    @Test
    fun getDetailTvShow() {
        doAnswer { invocation ->
            (invocation.arguments[1] as RemoteDataSource.DetailTvshowCallback)
                .onDetailTvshowReceived(dummyDetailTv)
            null
        }.`when`(remote).getDetailTvShow(eq(88396),any())
        val detailTvEntities = LiveDataTestUtil.getValue(catalogueRepository.getDetailTvShow(88396))
        verify(remote).getDetailTvShow(eq(88396), any())
        assertNotNull(detailTvEntities)
        assertEquals(dummyDetailTv.name, detailTvEntities.name)
        assertEquals(dummyDetailTv.firstAirDate, detailTvEntities.firstAirDate)
    }
}