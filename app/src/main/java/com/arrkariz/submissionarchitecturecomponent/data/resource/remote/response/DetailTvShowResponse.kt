package com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response

import com.google.gson.annotations.SerializedName

data class DetailTvShowResponse(

	@field:SerializedName("number_of_episodes")
	val numberOfEpisodes: Int,

	@field:SerializedName("genres")
	val genres: List<GenresItem>,

	@field:SerializedName("first_air_date")
	val firstAirDate: String,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("poster_path")
	val posterPath: String,

	@field:SerializedName("vote_average")
	val voteAverage: Double,

	@field:SerializedName("name")
	val name: String,
)
