package com.arrkariz.submissionarchitecturecomponent.ui.tvshows

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arrkariz.submissionarchitecturecomponent.R
import com.arrkariz.submissionarchitecturecomponent.databinding.ItemsRowBinding
import com.arrkariz.submissionarchitecturecomponent.data.resource.remote.response.TvShow
import com.arrkariz.submissionarchitecturecomponent.ui.detail.DetailActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class TvshowAdapter : RecyclerView.Adapter<TvshowAdapter.TvshowViewHolder>() {
    private var listTvshow = ArrayList<TvShow>()

    fun setTvshow(tvShow: List<TvShow>?) {
        if (tvShow == null) return
        this.listTvshow.clear()
        this.listTvshow.addAll(tvShow)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvshowViewHolder {
        val itemsBinding =  ItemsRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvshowViewHolder(itemsBinding)
    }

    override fun onBindViewHolder(holder: TvshowViewHolder, position: Int) {
        val tvShow = listTvshow[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int = listTvshow.size


    class TvshowViewHolder(private val binding: ItemsRowBinding) : RecyclerView.ViewHolder(binding.root) {
        private val imageBase = "https://image.tmdb.org/t/p/w500/"
        fun bind(tvShow: TvShow) {
            with(binding) {
                tvItemTitle.text = tvShow.name
                tvItemDesc.text = tvShow.overview
                tvRating.text = tvShow.voteAverage.toString()
                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.EXTRA_ID, tvShow.id)
                    intent.putExtra(DetailActivity.EXTRA_TAG, "tv")
                    itemView.context.startActivity(intent)
                }
                Glide.with(itemView.context)
                        .load(imageBase + tvShow.posterPath)
                        .apply(RequestOptions.placeholderOf(R.drawable.ic_loading)
                                .error(R.drawable.ic_baseline_broken_image_24))
                        .into(imgPoster)
            }
        }
    }
}