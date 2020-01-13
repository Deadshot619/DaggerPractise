package com.example.koinsharedviewmodelpractise

import com.example.koinsharedviewmodelpractise.ui.screenOne.ScreenOneViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    //ViewModel of Screen One
    viewModel { ScreenOneViewModel() }
}