package com.github.yuizho.decorator

abstract class Beverage {
    open val description = "Unknown Beverage"

    abstract fun cost(): Double
}

class Espresso : Beverage() {
    override val description = "Espresso"
    override fun cost(): Double = 1.99
}

class HouseBlend : Beverage() {
    override val description = "House Blend Coffee"
    override fun cost(): Double = .89
}