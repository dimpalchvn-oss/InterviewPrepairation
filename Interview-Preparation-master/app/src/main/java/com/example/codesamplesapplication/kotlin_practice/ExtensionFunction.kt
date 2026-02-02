package com.example.codesamplesapplication.kotlin_practice

fun main() {
    val myString = "Hello World Laxmikant!"
    println(myString.reverse())
}

fun String.reverse():String {
    var list = this.split(" ")
    var result = list.reversed().joinToString(" ")
    return result
}

