package com.demo.sunnyweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.sunnyweather.logic.network.SunnyWeatherNetWork
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.suspendCoroutine

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}
