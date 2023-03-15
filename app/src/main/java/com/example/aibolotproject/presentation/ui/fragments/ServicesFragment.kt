package com.example.aibolotproject.presentation.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.aibolotproject.R
import com.example.aibolotproject.databinding.FragmentServicesBinding
import com.example.aibolotproject.presentation.adapters.ServicesAdapter
import com.example.aibolotproject.presentation.ui.base.BaseFragment

class ServicesFragment : BaseFragment(R.layout.fragment_services) {

    private val binding by viewBinding(FragmentServicesBinding::bind)
    private val adapter = ServicesAdapter(this::onItemClick)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.rvServices.adapter = adapter
    }

    private fun onItemClick() {
        findNavController().navigate(R.id.servicesOrthopedicsFragment)
    }
}