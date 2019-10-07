package com.hungrycoderz.koinsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.koin.core.KoinComponent
import org.koin.core.inject

class MainViewModel : ViewModel(), KoinComponent {

    private val weatherRepo: WeatherRepository by inject()

    private val weatherStatus = MutableLiveData<String>()
    fun getWeatherStatus(): LiveData<String> = weatherStatus

    fun loadWeatherStatus() {
        weatherStatus.value = weatherRepo.getWeatherStatus()
    }
}