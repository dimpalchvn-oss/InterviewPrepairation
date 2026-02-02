package com.example.codesamplesapplication.builder_pattern

class BurgerBuilder {
    private var bun: String = "Plain"
    private var patty: String = "Veg"
    private var cheese: Boolean = false
    private var lettuce: Boolean = false
    private var sauce: String? = null

    fun setBun(bun: String) = apply { this.bun = bun }
    fun setPatty(patty: String) = apply { this.patty = patty }
    fun setCheese(cheese: Boolean) = apply { this.cheese = cheese }
    fun setLettuce(lettuce: Boolean) = apply { this.lettuce = lettuce }
    fun setSauce(sauce: String) = apply { this.sauce = sauce }

    fun build(): Burger {
        return Burger(bun, patty, cheese, lettuce, sauce)
    }
}

