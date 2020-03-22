package com.github.yuizho.abstractfactory

abstract class PizzaStore {
    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)
        pizza.prepare()
        pizza.cook()
        return pizza
    }

    // factory method
    abstract fun createPizza(type: String): Pizza
}

class NYPizzaStore : PizzaStore() {
    val ingredientFactory = NYPizzaIngredientFactory()

    override fun createPizza(type: String): Pizza {
        return if (type == "cheese") {
            CheesePizza(ingredientFactory)
        } else {
            throw RuntimeException("unexpected pizza type")
        }
    }
}