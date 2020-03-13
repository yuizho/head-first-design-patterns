package com.github.yuizho.decorator

abstract class CondimentDecorator : Beverage()

class Mocha(val beverage: Beverage) : CondimentDecorator() {
    override val description = "${beverage.description}, Mocha"
    override fun cost(): Double = beverage.cost() + .20
}