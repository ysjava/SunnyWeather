package com.demo.sunnyweather

import android.app.Application
import android.content.Context

/**
 * Created by White paper on 2020/4/24
 * Describe :
 */
class SunnyWeatherApplication : Application() {

    companion object {
        const val TOKEN = "mYjPusyVT1WEVh0W"
        lateinit var content: Context
    }

    override fun onCreate() {
        super.onCreate()
        content = applicationContext
    }
}