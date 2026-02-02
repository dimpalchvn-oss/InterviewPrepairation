package com.example.codesamplesapplication.kotlin_collections


/**
 * A Sequence in Kotlin is like a collection (List, Set, etc.), but it supports
 * lazy evaluation — meaning:
1.  Operations are not executed immediately.
2.  Elements are processed one by one, only when needed.*/
fun main(){
    val result = sequenceOf(1, 2, 3, 4)
        .map {
            println("Mapping $it")
            it * 2
        }
        .filter {
            println("Filtering $it")
            it > 4
        }
        .toList()

    println(result.joinToString())
}