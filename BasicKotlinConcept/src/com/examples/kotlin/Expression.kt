package com.examples.kotlin

/**
 * Expression
 */
fun main(args: Array<String>) {

    val n1: Int = readLine()!!.toInt()
    val n2: Int = readLine()!!.toInt()

    var max = if (n1 > n2) n1 else n2

    println("Max: $max")

    when (n1 > n2) {
        true -> max = n1
        else -> max = n2
    }

    println("Max: $max")
}