package com.example.codesamplesapplication.learning

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            delay(1000)
            println("Coroutine 1 finished on thread: ${Thread.currentThread().name}")
        }

        launch {
            delay(2000)
            println("Coroutine 2 finished on thread: ${Thread.currentThread().name}")
        }

        launch {
            delay(3000)
            println("Coroutine 3 finished on thread: ${Thread.currentThread().name}")
        }
    }
    println("After runBlocking coroutines launched")
}

//fun main() {
//    runBlocking {
//        launch {
//            delay(1000)
//            println("Coroutine 1 finished on thread: ${Thread.currentThread().name}")
//        }
//
//        launch {
//            delay(1000)
//            println("Coroutine 2 finished on thread: ${Thread.currentThread().name}")
//        }
//
//        launch {
//            delay(1000)
//            println("Coroutine 3 finished on thread: ${Thread.currentThread().name}")
//        }
//    }
//    println("After runBlocking coroutines launched")
//}

//fun main() {
//    val scope = CoroutineScope(Dispatchers.Default + Job())
//    scope.launch {
//        delay(1000)
//        println("Coroutine 1 finished on thread: ${Thread.currentThread().name}")
//    }
//
//    scope.launch {
//        delay(2000)
//        println("Coroutine 2 finished on thread: ${Thread.currentThread().name}")
//    }
//
//    scope.launch {
//        delay(3000)
//        println("Coroutine 3 finished on thread: ${Thread.currentThread().name}")
//    }
//    println("After all coroutines launched")
//    Thread.sleep(4000)
//}

//fun main() {
//    val scope = CoroutineScope(Dispatchers.Default + Job())
//
//    scope.launch {
//        val totalTime = measureTimeMillis {
//            val task1 = async {
//                delay(1000)
//                println("Task 1 done on: ${Thread.currentThread().name}")
//                10
//            }
//
//            val task2 = async {
//                delay(1000)
//                println("Task 2 done on: ${Thread.currentThread().name}")
//                20
//            }
//
//            val result = task1.await() + task2.await()
//            println("Result = $result")
//        }
//
//        println("Total execution time: $totalTime ms")
//    }
//
//    // Keep JVM alive long enough
//    Thread.sleep(2000)
//}

//fun main() = runBlocking {
//    val scope = CoroutineScope(Dispatchers.Default)
//
//    val job1 = scope.launch {
//        delay(1000)
//        println("Coroutine 1 finished on: ${Thread.currentThread().name}")
//    }
//    job1.join() // Wait for coroutine 1
//
//    val job2 = scope.launch {
//        delay(1000)
//        println("Coroutine 2 finished on: ${Thread.currentThread().name}")
//    }
//    job2.join() // Wait for coroutine 2
//
//    val job3 = scope.launch {
//        delay(1000)
//        println("Coroutine 3 finished on: ${Thread.currentThread().name}")
//    }
//    job3.join() // Wait for coroutine 3
//
//    val job4 = scope.launch {
//        delay(1000)
//        println("Coroutine 4 finished on: ${Thread.currentThread().name}")
//    }
//    job4.join() // Wait for coroutine 4
//
//    println("All coroutines finished sequentially.")
//}

//fun main() {
//    val scope = CoroutineScope(Dispatchers.Default)
//
//    scope.launch {
//        delay(1000)
//        println("Coroutine 1 finished on: ${Thread.currentThread().name}")
//
//        launch {
//            delay(1000)
//            println("Coroutine 2 finished on: ${Thread.currentThread().name}")
//
//            launch {
//                delay(1000)
//                println("Coroutine 3 finished on: ${Thread.currentThread().name}")
//
//                launch {
//                    delay(1000)
//                    println("Coroutine 4 finished on: ${Thread.currentThread().name}")
//                }
//            }
//        }
//    }
//
//    // Give enough time for all nested coroutines to finish
//    Thread.sleep(5000)
//    println("All coroutines finished sequentially.")
//}

//fun main() {
//    val scope = CoroutineScope(Dispatchers.Default)
//
//    scope.launch {
//        coroutine1()
//        coroutine2()
//        coroutine3()
//        coroutine4()
//        println("All coroutines finished sequentially.")
//    }
//
//    // Keep the main thread alive to see output
//    Thread.sleep(5000)
//}
//
//// Define each coroutine task as a suspend function
//suspend fun coroutine1() {
//    delay(1000)
//    println("Coroutine 1 finished on: ${Thread.currentThread().name}")
//}
//
//suspend fun coroutine2() {
//    delay(1000)
//    println("Coroutine 2 finished on: ${Thread.currentThread().name}")
//}
//
//suspend fun coroutine3() {
//    delay(1000)
//    println("Coroutine 3 finished on: ${Thread.currentThread().name}")
//}
//
//suspend fun coroutine4() {
//    delay(1000)
//    println("Coroutine 4 finished on: ${Thread.currentThread().name}")
//}

//fun main() = runBlocking {
//    val res1 = GlobalScope.async {
//        delay(1000L)
//        "Text 1"
//    }
//    val res2 = GlobalScope.async {
//        delay(3000L)
//        "Text 2"
//    }
//    val res3 = GlobalScope.async {
//        delay(2000L)
//        "Text 3"
//    }
//    println(res1.await())
//    println(res2.await())
//    println(res3.await())
//}

//fun main() {
//    println("Start")
//
//    val deferredResult = GlobalScope.async {
//        delay(1000) // Simulate some background work
//        "Coroutine 1 completed"
//    }
//
//    // Do some other work in the meantime
//
//    // Retrieve the result from the deferred value
//    runBlocking {
//        val result = deferredResult.await()
//        println(result)
//    }
//
//    println("End")
//}

//fun main() = runBlocking {
//    println("First statement of Async")
//
//    launch {
//        val one = async { sampleOne()}
//        val two = async { sampleTwo()}
//        if(one.await() && two.await()){
//            println("Both returned true")
//        }else {
//            println("Someone returned false")
//        }
//    }
//    delay(3500)
//    println("Last statement of Async")
//}
//
//private suspend fun sampleOne(): Boolean {
//    delay(1000L)
//    return true
//}
//private suspend fun sampleTwo(): Boolean {
//    delay(3000L)
//    return false
//}


