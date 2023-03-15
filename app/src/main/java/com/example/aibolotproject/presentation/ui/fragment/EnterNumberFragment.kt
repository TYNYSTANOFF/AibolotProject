package com.example.aibolotproject.presentation.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.aibolotproject.R
import com.example.aibolotproject.databinding.FragmentEnterNumberBinding
import com.google.firebase.auth.FirebaseAuth
import java.util.*

class EnterNumberFragment : Fragment() {

private val binding by viewBinding(FragmentEnterNumberBinding::bind)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_enter_number, container, false)
setOnClick()
    }

    private fun setOnClick() {

    }

}