package com.github.yuizho.abstractfactory

interface PizzaIngredientFactory {
    fun createDough(): Dough
    fun createSauce(): Sauce
    fun createCheese(): Cheese
    fun createVeggies(): List<Veggies>
}

class NYPizzaIngredientFactory : PizzaIngredientFactory {
    override fun createDough(): Dough = ThinCrustDough()
    override fun createSauce(): Sauce = MarinaraSauce()
    override fun createCheese(): Cheese = ReggianoCheese()
    override fun createVeggies(): List<Veggies> = listOf(Garlic(), Onion())
}