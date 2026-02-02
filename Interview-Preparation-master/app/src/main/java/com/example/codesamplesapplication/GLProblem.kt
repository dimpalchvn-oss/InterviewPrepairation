package com.example.codesamplesapplication

/*
A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet.
Ignore case. Return either pangram or not pangram as appropriate.
Example : the quick brown fox jumps over the lazy dog
The string contains all letters in the English alphabet, so return pangram.*/

fun main() {
    val inputString = "The quick brown fox jumps over the laczy dog"
    var alphabetMap = mutableMapOf<Char, Int>()

    for (char in 'a'..'z') {
        if (inputString.contains(char, ignoreCase = true))
            alphabetMap.put(char, 1)
        else
            alphabetMap.put(char, 0)
    }
    var pangram = 0
    for (count in alphabetMap.values) {
        pangram += count
    }

    if (pangram == 26) {
        println("Pangram")
    } else {
        println("Not pangram")
    }
}

