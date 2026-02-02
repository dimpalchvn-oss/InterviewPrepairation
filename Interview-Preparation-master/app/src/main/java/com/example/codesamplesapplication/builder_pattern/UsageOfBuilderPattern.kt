package com.example.codesamplesapplication.builder_pattern

fun main() {
    val myBurger = BurgerBuilder()
        .setBun("Whole wheat")
        .setPatty("Aloo Tickki")
        .setCheese(true)
        .setSauce("Mayo")
        .build()

    println(myBurger.toString())

    val myComputerMachine = ComputerBuilder()
        .installGraphicsCard(true)
        .installBluetooth(true)
        .installWifiCard(true)
        .build()

    println("Lax Machine = $myComputerMachine")

    val sangitaComputerMachine = ComputerBuilder2()
        .installWIFICard(true)
        .installBluetooth(true)
        .build()

    println("Sangita's Machine = $sangitaComputerMachine")
}