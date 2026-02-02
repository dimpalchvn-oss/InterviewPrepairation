package com.example.codesamplesapplication.kotlin_practice

fun add(a: Int, b: Int): Int {
    return a + b
}

fun higherOrder(x: Int, y: Int, doAdd: (Int, Int) -> Int): Int {
    val p = x + 1
    val q = y + 1
    return doAdd(p, q)
}

fun main() {
    val result = higherOrder(10, 20, ::add)
    println(result)
}