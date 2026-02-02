package com.example.codesamplesapplication.kotlin_collections

fun main(){
    val myArray = arrayOf<String>("Lax", "Laxmi", "Laxmi", "Lax", "Sangita")
    println(myArray.joinToString())

    myArray.set(2, "Shivansh")
    println(myArray.joinToString())


    val mySet = setOf<String>("Lax", "Laxmi", "Laxmi", "Lax", "Sangita")
    println(mySet.joinToString())
}