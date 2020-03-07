package com.github.yuizho.observer

fun main() {
    val weatherData = WeatherData().also {
        it.addObserver(CurrentConditionDisplay())
                .addObserver(ForecastDisplay())
    }
    weatherData.updateMeasurement(Measurement(1.1f, 2.2f, 3.3f))
    weatherData.updateMeasurement(Measurement(11.1f, 22.2f, 33.3f))
}