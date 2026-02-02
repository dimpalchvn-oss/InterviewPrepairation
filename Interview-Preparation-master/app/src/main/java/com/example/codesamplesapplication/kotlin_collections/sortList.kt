package com.example.codesamplesapplication.kotlin_collections

fun main() {
    val myList = listOf<Int>(1, 5, 4, 2, 3)
    println(myList.sorted().joinToString())
}