package com.hungrycoderz.koinsample

import android.app.Application
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        setupKoin()
    }

    private fun setupKoin() {
        val modules = module {
            single { WeatherRepository() }
        }

        startKoin {
            modules(modules)
        }
    }
}