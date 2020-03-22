package com.github.yuizho.factorymethod

abstract class PizzaStore {
    fun orderPizza(type: String): Pizza {
        val pizza = createPizza(type)
        pizza.cook()
        return pizza
    }

    // factory method
    abstract fun createPizza(type: String): Pizza
}

class NYPizzaStore : PizzaStore() {
    override fun createPizza(type: String): Pizza {
        return if (type == "cheese") {
            NYStyleCheesePizza()
        } else {
            throw RuntimeException("unexpected pizza type")
        }
    }
}