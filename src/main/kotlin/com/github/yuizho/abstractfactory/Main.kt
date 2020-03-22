package com.github.yuizho.abstractfactory

fun main() {
    val nyStore = NYPizzaStore()
    val pizza = nyStore.orderPizza("cheese")
    println("Ethan ordered a ${pizza.name}")
}