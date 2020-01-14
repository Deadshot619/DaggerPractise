package com.example.koinsharedviewmodelpractise.ui.screenOne

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.koinsharedviewmodelpractise.R
import com.example.koinsharedviewmodelpractise.databinding.ScreenOneFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ScreenOne : Fragment() {

    //layout binding variable
    private lateinit var binding: ScreenOneFragmentBinding

    //Lazily Initialize viewModel using Koin
    private val viewModel: ScreenOneViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate Layout
        binding = ScreenOneFragmentBinding.inflate(inflater)

        //Set lifecycle owner
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        binding.btnSaveNext.setOnClickListener {
            findNavController().navigate(R.id.action_screenOne_to_screenTwoFragment)
        }
    }

}
