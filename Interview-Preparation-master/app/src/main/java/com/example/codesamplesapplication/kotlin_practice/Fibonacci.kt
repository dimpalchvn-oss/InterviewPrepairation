package com.example.codesamplesapplication.kotlin_practice

fun main() {
    val n = 10
    println("Fibonacci series up to position $n:")
    printFibonacciSeries(n)
}

fun printFibonacciSeries(n: Int) {

    var a = 0
    var b = 1
    var fib = 1

    print("$a $b")
    while (fib <= n) {
        fib = a + b
        a = b
        b = fib

        print(" $fib")
    }
}