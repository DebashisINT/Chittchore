package com.chittchorefsm.features.weather.api

import com.chittchorefsm.base.BaseResponse
import com.chittchorefsm.features.task.api.TaskApi
import com.chittchorefsm.features.task.model.AddTaskInputModel
import com.chittchorefsm.features.weather.model.ForeCastAPIResponse
import com.chittchorefsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}