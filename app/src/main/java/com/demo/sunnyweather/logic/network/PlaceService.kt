package com.demo.sunnyweather.logic.network

import com.demo.sunnyweather.SunnyWeatherApplication
import com.demo.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by White paper on 2020/4/24
 * Describe :
 */
interface PlaceService {

    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}