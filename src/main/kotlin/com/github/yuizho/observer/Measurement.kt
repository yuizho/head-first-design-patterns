package com.github.yuizho.observer

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

/**
 * The Head First Design Pattern sample code uses java.util.Observable, java.util.Observer.
 * But the Api is deprecated since java 9.
 * https://stackoverflow.com/questions/46380073/observer-is-deprecated-in-java-9-what-should-we-use-instead-of-it
 *
 * I uses java.beans.PropertyChangeSupport, java.beans.PropertyChangeListener instead.
 *
 */
class WeatherData {
    private val pcs = PropertyChangeSupport(this)
    var measurement = Measurement(0.0f, 0.0f, 0.0f)

    fun addObserver(obs: PropertyChangeListener): WeatherData {
        pcs.addPropertyChangeListener(obs)
        return this
    }

    fun updateMeasurement(measurement: Measurement) {
        // PropertyChangeSupport#firePropertyChange requires old nad new value.
        // that's why the implementation of pull style observer is a little bothersome.
        pcs.firePropertyChange("measurement", this.measurement, measurement)
        this.measurement = measurement
    }
}

data class Measurement(val temperature: Float, val humidity: Float, val pressure: Float)