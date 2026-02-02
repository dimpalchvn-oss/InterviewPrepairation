package com.example.codesamplesapplication.kotlin_practice

fun commonMinimumPrefix(strings: List<String>): String {
    var prefix = strings[0]
    for (str in strings.drop(1)){
        println(str)
        while(!str.startsWith(prefix)){
            prefix = prefix.dropLast(1)
        }
    }
    return prefix
}

fun main() {
    val input = mutableListOf<String>("flower","flow","flight")
    val result = commonMinimumPrefix(input)
    println("Common Min Prefix = $result")
}