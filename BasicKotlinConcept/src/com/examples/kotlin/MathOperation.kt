package com.examples.kotlin
/**
 * Math com.examples.kotlin.Operation
 */
fun main(args: Array<String>) {

    var n1: Int = readLine()!!.toInt()
    var n2: Int = readLine()!!.toInt()
    var result: Int

    result = n1 + n2

    println("com.examples.kotlin.getResult: " + result)

    result = n1 - n2

    println("com.examples.kotlin.getResult: " + result)

    result = n1 * n2

    println("com.examples.kotlin.getResult: " + result)

    result = n1 / n2

    println("com.examples.kotlin.getResult: " + result)
}