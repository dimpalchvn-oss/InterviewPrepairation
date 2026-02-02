package com.example.codesamplesapplication.kotlin_practice

fun main(){
    val input = "swiss"
    val uniqueChars = findUniqueChars(input)
    println("Unique characters in '$input': $uniqueChars")
}

fun findUniqueChars(input: String): Set<Char> {
    val charCountMap = mutableMapOf<Char, Int>()
    for (char in input) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }
    return charCountMap.filter { it.value == 1 }.keys
}