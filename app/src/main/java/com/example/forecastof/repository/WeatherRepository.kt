package com.example.forecastof.repository

import com.example.forecastof.api.ApiService
import javax.inject.Inject

class WeatherRepository
@Inject
constructor(private val apiService: ApiService){

    suspend fun getWeather()= apiService.getWeather()

}