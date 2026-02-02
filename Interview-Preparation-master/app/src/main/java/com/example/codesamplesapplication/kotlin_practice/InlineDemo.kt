package com.example.codesamplesapplication.kotlin_practice

fun loop(n: Long) {
    for (i in 0..n) {
       println(i)
    }
}

inline fun runAndCalculateTime(fn: () -> Unit) {
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken for execution: ${end - start}")
}

fun main() {
    runAndCalculateTime {
        loop(10)
    }
}