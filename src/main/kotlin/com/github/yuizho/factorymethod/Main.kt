package com.github.yuizho.factorymethod

fun main() {
    val nyStore = NYPizzaStore()
    val pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a $pizza")
}