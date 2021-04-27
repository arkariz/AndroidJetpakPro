package com.arrkariz.submissionarchitecturecomponent.utils

import android.content.Context
import com.arrkariz.submissionarchitecturecomponent.data.resource.CatalogueRepository
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.RemoteDataSource

object Injection {
    fun provideRepository(context: Context): CatalogueRepository {

        val remoteDataSource = RemoteDataSource()

        return CatalogueRepository.getInstance(remoteDataSource)
    }
}