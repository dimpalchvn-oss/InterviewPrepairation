package com.example.codesamplesapplication.kotlin_collections


fun main() {
    val numbers = mutableListOf<Int>(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println(evenNumbers)
}