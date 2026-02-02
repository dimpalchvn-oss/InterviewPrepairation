package com.example.codesamplesapplication.kotlin_practice

fun main() {
    val kotlin = "🙂"
    val obj = MyClass()
    println(obj.add(10, 20))

    println(kotlin)
}

interface AInterface {
    fun add(a: Int, b: Int) : Int
}

interface BInterface {
    fun add(a: Int, b: Int) : Int
}

class MyClass() : AInterface, BInterface {
    override fun add(a: Int, b: Int) : Int {
        return a + b
    }
}