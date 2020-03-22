package com.github.yuizho.factorymethod

abstract class Pizza(
        val name: String,
        val dough: String,
        val sauce: String,
        val toppings: List<String>
) {
    fun prepare() {
        println("Preparing $name")
        println("Tossing dough...")
        println("Adding sauce...")
        println("Adding toppings: $toppings")
    }

    fun cook() {
        println("cook a Pizza")
    }

    override fun toString(): String {
        return "Pizza(name='$name', dough='$dough', sauce='$sauce', toppings=$toppings)"
    }
}

class NYStyleCheesePizza : Pizza(
        name = "NY Style Sause and Cheese Pizza",
        dough = "Thin Crust Dough",
        sauce = "Mrinara Sause",
        toppings = listOf("Crated Regginano Cheese")
) {
}