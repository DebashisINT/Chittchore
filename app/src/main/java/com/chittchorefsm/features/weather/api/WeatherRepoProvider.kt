package com.chittchorefsm.features.weather.api

import com.chittchorefsm.features.task.api.TaskApi
import com.chittchorefsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}