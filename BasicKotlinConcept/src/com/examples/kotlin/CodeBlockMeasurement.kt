package com.examples.kotlin

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun measureHello() {
    val startTime = System.currentTimeMillis()

    println("Hello World")

    val totalTime = System.currentTimeMillis() - startTime

    println("Total time: ${totalTime}")
}



fun main(args: Array<String>) {

    // Old way
    measureHello()

    // New way
    val measureHelloTimeNs = measureNanoTime {
        println("Hello World")
    }

    println("Total time in NS: ${measureHelloTimeNs}")

    // New way
    val measureHelloTimeMs = measureTimeMillis {
        println("Hello World")
    }

    println("Total time in MS: ${measureHelloTimeMs}")
}