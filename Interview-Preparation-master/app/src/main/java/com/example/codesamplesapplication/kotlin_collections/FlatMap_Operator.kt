package com.example.codesamplesapplication.kotlin_collections

fun main() {
    val myList = listOf(
        listOf(1, 2),
        listOf(4, 5)
    )
    val flattenedList = myList.flatMap { it.toList() }
    println(flattenedList.joinToString())
}

//fun main() {
//    val word = "Java"
//    val chars = word.toList()
//    println(chars)
//}

//fun main() {
//    val words = listOf("Kotlin", "Java")
//    val chars = words.flatMap { it.toList() }
//    println(chars)
//}

