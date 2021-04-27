package com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response

import com.google.gson.annotations.SerializedName

data class TvResponse(

	@field:SerializedName("results")
	val results: List<TvShow>
)

data class TvShow(
	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("poster_path")
	val posterPath: String,

	@field:SerializedName("vote_average")
	val voteAverage: Double,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("id")
	val id: Int,
)
