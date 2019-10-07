package com.hungrycoderz.koinsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent

class MainViewModel : ViewModel(), KoinComponent {

    // TODO: Inject weather repository

    private val weatherStatus = MutableLiveData<String>()
    fun getWeatherStatus(): LiveData<String> = weatherStatus

    fun loadWeatherStatus() {
        // TODO: Get weather status from weather repository
    }
}