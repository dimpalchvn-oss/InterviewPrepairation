package com.example.codesamplesapplication.kotlin_practice

abstract class One(){
    abstract fun add(x: Int, y: Int): Int
}


abstract class Two(): One() {
//    abstract fun subtract(x: Int, y: Int): Int
}

class Calculator(): Two() {
//    override fun subtract(x: Int, y: Int): Int {
//        return x - y
//    }

    override fun add(x: Int, y: Int): Int {
        return x + y
    }
}


fun main() {
    val calc = Calculator()
    println("Addition: ${calc.add(10, 5)}")       // Output: 15
//    println("Subtraction: ${calc.subtract(10, 5)}")
}
