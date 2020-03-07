package com.github.yuizho.observer

import java.beans.PropertyChangeEvent
import java.beans.PropertyChangeListener

interface DisplayElement {
    fun display()
}

class CurrentConditionDisplay : DisplayElement, PropertyChangeListener {
    var measurement = Measurement(0.0f, 0.0f, 0.0f)

    override fun display() {
        println("CurrentConditionDisplay: { measurement = $measurement }")
    }

    override fun propertyChange(pce: PropertyChangeEvent) {
        this.measurement = pce.newValue as? Measurement
                ?: Measurement(0.0f, 0.0f, 0.0f)
        display()
    }
}

class ForecastDisplay : DisplayElement, PropertyChangeListener {
    var pressure = 0.0f

    override fun display() {
        println("CurrentConditionDisplay: { pressure=$pressure }")
    }

    override fun propertyChange(pce: PropertyChangeEvent) {
        val measurement = pce.newValue as? Measurement
                ?: Measurement(0.0f, 0.0f, 0.0f)
        this.pressure = measurement.pressure
        display()
    }
}