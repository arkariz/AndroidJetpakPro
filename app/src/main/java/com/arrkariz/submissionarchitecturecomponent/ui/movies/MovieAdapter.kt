package com.arrkariz.submissionarchitecturecomponent.ui.movies

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arrkariz.submissionarchitecturecomponent.R
import com.arrkariz.submissionarchitecturecomponent.databinding.ItemsRowBinding
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.ResultsItem
import com.arrkariz.submissionarchitecturecomponent.ui.detail.DetailActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    private var listMovie = ArrayList<ResultsItem>()

    fun setMovie(movies: List<ResultsItem>?) {
        if (movies == null) return
        this.listMovie.clear()
        this.listMovie.addAll(movies)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemBinding =  ItemsRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovie.size


    class MovieViewHolder(private val binding: ItemsRowBinding) : RecyclerView.ViewHolder(binding.root) {
        private val imageBase = "https://image.tmdb.org/t/p/w500/"
        fun bind(movie: ResultsItem) {
            with(binding) {
                tvItemTitle.text = movie.title
                tvItemDesc.text = movie.overview
                tvRating.text = movie.voteAverage.toString()
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_ID, movie.id)
                    intent.putExtra(DetailActivity.EXTRA_TAG, "movie")
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                        .load(imageBase + movie.posterPath)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_baseline_broken_image_24))
                        .into(imgPoster)
            }
        }
    }
}