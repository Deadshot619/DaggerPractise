package com.example.koinsharedviewmodelpractise

import com.example.koinsharedviewmodelpractise.ui.screenOne.ScreenOneViewModel
import com.example.koinsharedviewmodelpractise.ui.screenTwo.ScreenTwoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    //ViewModel of Screen One
    viewModel { ScreenOneViewModel() }

    //ViewModel of Screen Two
    viewModel { ScreenTwoViewModel() }
}