package com.arrkariz.submissionarchitecturecomponent.ui.tvshows

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.arrkariz.submissionarchitecturecomponent.utils.ViewModelFactory
import com.arrkariz.submissionarchitecturecomponent.databinding.FragmentTvshowBinding

class TvshowFragment : Fragment() {

    private lateinit var binding: FragmentTvshowBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentTvshowBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val factory = ViewModelFactory.getInstance(requireActivity())
            val viewModel = ViewModelProvider(this, factory)[TvshowViewModel::class.java]
            viewModel.getTvshow().observe(this, { it ->
                val tvShowAdapter = TvshowAdapter()
                tvShowAdapter.setTvshow(it)
                tvShowAdapter.notifyDataSetChanged()

                with(binding.rvTv) {
                    layoutManager = LinearLayoutManager(context)
                    setHasFixedSize(true)
                    adapter = tvShowAdapter
                }
            })
        }
    }
}