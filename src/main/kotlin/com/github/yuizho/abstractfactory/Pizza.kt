package com.github.yuizho.abstractfactory

abstract class Pizza(
        val name: String,
        val dough: Dough,
        val sauce: Sauce,
        val cheese: Cheese,
        val toppings: List<Veggies>
) {
    fun prepare() {
        println("Preparing $name")
        println("Tossing $dough")
        println("Adding $sauce")
        println("Adding $cheese")
        println("Adding toppings: $toppings")
    }

    fun cook() {
        println("cook a Pizza")
    }
}

class CheesePizza(ingredientFactory: PizzaIngredientFactory) : Pizza(
        name = "NY Style Sause and Cheese Pizza",
        dough = ingredientFactory.createDough(),
        sauce = ingredientFactory.createSauce(),
        cheese = ingredientFactory.createCheese(),
        toppings = ingredientFactory.createVeggies()
)