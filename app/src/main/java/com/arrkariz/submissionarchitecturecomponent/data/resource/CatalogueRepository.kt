package com.arrkariz.submissionarchitecturecomponent.data.resource

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.arrkariz.submissionarchitecturecomponent.data.entity.MovieEntity
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.RemoteDataSource
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailMovieResponse
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.DetailTvShowResponse
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.ResultsItem
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.TvShow

class CatalogueRepository private constructor(private val remoteDataSource: RemoteDataSource) :
    CatalogueDataSource {

    companion object {
        @Volatile
        private var instance: CatalogueRepository? = null
        fun getInstance(remoteData: RemoteDataSource): CatalogueRepository =
            instance ?: synchronized(this) {
                instance ?: CatalogueRepository(remoteData).apply { instance = this }
            }
    }

    override fun getPopularMovies(): LiveData<List<ResultsItem>> {
        val movieResult = MutableLiveData<List<ResultsItem>>()
        remoteDataSource.getPopularMovies(object: RemoteDataSource.PopularMovieCallback{
            override fun onAllMovieReceived(movieResponse: List<ResultsItem>) {
                val movieList = ArrayList<ResultsItem>()

                for (response in movieResponse){
                    val movie = ResultsItem(
                        response.overview,
                        response.title,
                        response.posterPath,
                        response.voteAverage,
                        response.id,
                    )
                    movieList.add(movie)
                }
                movieResult.postValue(movieList)
            }
        })
        return movieResult
    }

    override fun getPopularTvShow(): LiveData<List<TvShow>> {
        val tvResult = MutableLiveData<List<TvShow>>()
        remoteDataSource.getPopularTvShow(object: RemoteDataSource.PopularTvshowCallback{
            override fun onAllTvshowReceived(tvShowResponse: List<TvShow>) {
                val tvShowList = ArrayList<TvShow>()

                for (response in tvShowResponse){
                    val tv = TvShow(
                        response.overview,
                        response.posterPath,
                        response.voteAverage,
                        response.name,
                        response.id,
                    )
                    tvShowList.add(tv)
                }
                tvResult.postValue(tvShowList)
            }
        })
        return tvResult
    }

    override fun getDetailMovie(movieId: Int): LiveData<DetailMovieResponse> {
        val detailResult = MutableLiveData<DetailMovieResponse>()
        remoteDataSource.getDetailMovie(movieId, object: RemoteDataSource.DetailMovieCallback{
            override fun onDetailMovieReceived(detailResponse: DetailMovieResponse) {
                detailResult.postValue(detailResponse)
            }
        })
        return detailResult
    }

    override fun getDetailTvShow(tvId: Int): LiveData<DetailTvShowResponse> {
        val detailResult = MutableLiveData<DetailTvShowResponse>()
        remoteDataSource.getDetailTvShow(tvId, object: RemoteDataSource.DetailTvshowCallback{
            override fun onDetailTvshowReceived(detailTvResponse: DetailTvShowResponse) {
                detailResult.postValue(detailTvResponse)
            }
        })
        return detailResult
    }
}