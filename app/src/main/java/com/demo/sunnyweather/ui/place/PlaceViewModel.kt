package com.demo.sunnyweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.demo.sunnyweather.logic.Repository

/**
 * Created by White paper on 2020/4/24
 * Describe :
 */
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
}