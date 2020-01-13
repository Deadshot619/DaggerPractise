package com.example.koinsharedviewmodelpractise.ui.screenOne

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.koinsharedviewmodelpractise.R
import com.example.koinsharedviewmodelpractise.databinding.ScreenOneFragmentBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ScreenOne : Fragment() {

    private lateinit var binding: ScreenOneFragmentBinding

    //Lazily Initialize viewModel using Koin
    private val viewModel: ScreenOneViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ScreenOneFragmentBinding.inflate(inflater)
        binding.lifecycleOwner = this

        return inflater.inflate(R.layout.screen_one_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

}
