package com.github.yuizho.iteratorcomposite

fun main() {
    val pancakeHouseMenu = Menu("PANCAKE HOUSE MENU", "Breakfast")
    val dinerMenu = Menu("DINER MENU", "Lunch")
    val cafeMenu = Menu("CAFE MENU", "Dinner")
    val dessertMenu = Menu("DESSERT MENU", "Dessert of course!")
    dinerMenu.add(MenuItem(
            "Pasta",
            "Spagetti with Mrinara Sause",
            true,
            3.89
    ))
    dessertMenu.add(MenuItem(
            "Apple Pie",
            "Apple pie with a flakey crust",
            true,
            1.59
    ))

    val allMenus = Menu("ALL MENUS", "All menus combied")
    allMenus.add(pancakeHouseMenu)
    allMenus.add(dinerMenu)
    allMenus.add(cafeMenu)
    dinerMenu.add(dessertMenu)

    val waitress = Waitress(allMenus)
    waitress.printMenu()
}