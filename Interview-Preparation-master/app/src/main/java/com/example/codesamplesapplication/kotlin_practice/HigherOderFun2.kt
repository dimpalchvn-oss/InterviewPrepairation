package com.example.codesamplesapplication.kotlin_practice

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun returnMeAddFunction(): (Int, Int) -> Int {
    return ::add
}

fun main() {
    val operation = returnMeAddFunction()

    //I have some logic that needs to be implemented on 2 numbers and then
    // I will call the operation function
    var x = 10 + 1
    var y = 20 + 1

    val result = operation(x, y)
    println(result)
}
