package com.example.forecastof.api

import com.example.forecastof.model.Weather
import retrofit2.Response
import retrofit2.http.GET


interface ApiService {

    @GET("weather/Manaus")
    suspend fun getWeather():Response<Weather>



}