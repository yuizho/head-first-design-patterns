package com.github.yuizho.decorator

fun main() {
    val beverage = Espresso()
    println("${beverage.description} $${beverage.cost()}")

    val beverage2 = Mocha(Mocha(HouseBlend()))
    println("${beverage2.description} $${beverage2.cost()}")
}