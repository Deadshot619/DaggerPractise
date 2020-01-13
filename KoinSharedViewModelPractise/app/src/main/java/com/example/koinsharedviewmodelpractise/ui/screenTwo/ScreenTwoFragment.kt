package com.example.koinsharedviewmodelpractise.ui.screenTwo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.koinsharedviewmodelpractise.databinding.ScreenTwoFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ScreenTwoFragment : Fragment() {

    private lateinit var binding: ScreenTwoFragmentBinding

    private val viewModel: ScreenTwoViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ScreenTwoFragmentBinding.inflate(inflater)

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

}
