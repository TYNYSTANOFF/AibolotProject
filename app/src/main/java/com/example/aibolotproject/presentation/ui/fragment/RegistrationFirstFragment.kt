package com.example.aibolotproject.presentation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.aibolotproject.R
import com.example.aibolotproject.databinding.FragmentEnterNumberBinding
import com.example.aibolotproject.databinding.FragmentRegistrationFirstBinding


class RegistrationFirstFragment : Fragment() {

    private val binding by viewBinding(FragmentRegistrationFirstBinding::bind)
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_registration_first, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
        navController = NavHostFragment.findNavController(this)

    }

    private fun onClick() {
        binding.btnRegister.setOnClickListener {
            navController.navigate(R.id.enterNumberFragment)
        }
    }

}