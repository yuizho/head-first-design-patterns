package com.github.yuizho.iteratorcomposite

abstract class MenuComponent {
    open fun add(menuComponent: MenuComponent): Unit {
        throw UnsupportedOperationException()
    }

    open fun remove(menuComponent: MenuComponent): Unit {
        throw UnsupportedOperationException()
    }

    open fun child(i: Int): MenuComponent {
        throw UnsupportedOperationException()
    }

    open fun name(): String {
        throw UnsupportedOperationException()
    }

    open fun description(): String {
        throw UnsupportedOperationException()
    }

    open fun price(): Double {
        throw UnsupportedOperationException()
    }

    open fun isVegetarian(): Boolean {
        throw UnsupportedOperationException()
    }

    open fun print(): Unit {
        throw UnsupportedOperationException()
    }
}

class MenuItem(private val name: String,
               private val description: String,
               private val vegetarian: Boolean,
               private val price: Double) : MenuComponent() {
    override fun name(): String = name

    override fun description(): String = description

    override fun price(): Double = price

    override fun isVegetarian(): Boolean = vegetarian

    override fun print() {
        print(" $name")
        if (vegetarian) {
            print("(v)")
        }
        println(", $price")
        println("    -- $description")
    }
}

class Menu(private val name: String,
           private val description: String) : MenuComponent() {

    private val menuComponents = mutableListOf<MenuComponent>()

    override fun add(menuComponent: MenuComponent): Unit {
        menuComponents.add(menuComponent)
    }

    override fun remove(menuComponent: MenuComponent): Unit {
        menuComponents.remove(menuComponent)
    }

    override fun child(i: Int): MenuComponent {
        return menuComponents[i]
    }

    override fun name(): String = name

    override fun description(): String = description

    override fun print() {
        print("\n$name")
        println(", $description")
        println("-----------------------------")

        val iterator = menuComponents.iterator()
        while (iterator.hasNext()) {
            val menuComponent = iterator.next()
            menuComponent.print()
        }
    }
}