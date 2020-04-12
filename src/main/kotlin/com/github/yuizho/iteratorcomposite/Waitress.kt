package com.github.yuizho.iteratorcomposite

class Waitress(private val allMenus: MenuComponent) {
    fun printMenu() {
        allMenus.print()
    }
}