package com.arrkariz.submissionarchitecturecomponent.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.arrkariz.submissionarchitecturecomponent.utils.ViewModelFactory
import com.arrkariz.submissionarchitecturecomponent.databinding.ActivityDetailBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object{
        const val EXTRA_ID = "extra_id"
        const val EXTRA_TAG = "extra_tag"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val factory = ViewModelFactory.getInstance(DetailActivity())
        val viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]
        val contentId = intent.getIntExtra(EXTRA_ID, 0)
        val tag = intent.getStringExtra(EXTRA_TAG)

        val imageBase = "https://image.tmdb.org/t/p/w500/"
        viewModel.setSelectedContent(contentId)

        if (tag == "movie"){
            viewModel.getDetailMovie().observe(this, {it ->
                binding.apply {
                    tvTitle.text = it.title
                    tvReleaseDate.text = "Release date: ${it.releaseDate}"
                    tvDuration.text = "Duration: ${it.runtime.toString()}min"
                    tvRatingStar.text = it.voteAverage.toString()
                    tvDesc.text = it.overview

                    val genreList = mutableListOf<String>()
                    for (genre in it.genres){
                        genreList.add(genre.name)
                    }
                    tvGenre.text = genreList.joinToString()

                    Glide.with(this@DetailActivity)
                        .load(imageBase + it.posterPath)
                        .apply(RequestOptions().override(55, 55))
                        .transition(DrawableTransitionOptions.withCrossFade())
                        .into(ivPoster)
                }
            })
        } else{
            viewModel.getDetailTvShow().observe(this, {it ->
                binding.apply {
                    tvTitle.text = it.name
                    tvReleaseDate.text = "First Air Date: ${it.firstAirDate}"
                    tvDuration.text = "Number of Episode: ${it.numberOfEpisodes.toString()}"
                    tvRatingStar.text = it.voteAverage.toString()
                    tvDesc.text = it.overview

                    val genreList = mutableListOf<String>()
                    for (genre in it.genres){
                        genreList.add(genre.name)
                    }
                    tvGenre.text = genreList.joinToString()

                    Glide.with(this@DetailActivity)
                        .load(imageBase + it.posterPath)
                        .apply(RequestOptions().override(55, 55))
                        .transition(DrawableTransitionOptions.withCrossFade())
                        .into(ivPoster)
                }
            })
        }

    }
}