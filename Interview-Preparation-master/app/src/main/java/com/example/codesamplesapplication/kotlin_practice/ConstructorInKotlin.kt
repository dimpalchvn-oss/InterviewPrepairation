package com.example.codesamplesapplication.kotlin_practice

class ConstructorInKotlin(myInt: Int){

    init {
        println("In First Init block:")
        println(myInt)
    }

    init {
        println("In Second Init block:")
        println(myInt)
//        println(myString) // Not accessible before initialization of var
    }

    var myString: String = "Initial value"

    constructor(myNextInt: Int, myString: String): this(myNextInt) {
        println("In Secondary constructor:")
        printValues()
        this.myString = myString
        printValues()
    }

    init {
        println("In third init block:")
        println(myInt)
        println(myString + "\n")
    }

    fun printValues() {
        println("In printValue func: $myString")
    }
}

fun main() {
//    println("Calling primary constructor")
//    ConstructorInKotlin(10)


    println("Calling secondary constructor")
    ConstructorInKotlin(20, "Laxmikant")
}