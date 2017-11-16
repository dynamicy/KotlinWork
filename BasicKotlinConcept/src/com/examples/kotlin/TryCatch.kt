package com.examples.kotlin

fun main(args: Array<String>) {

    try {

        val num = readLine()!!.toInt()

        val result = 100 / num

        println("Result: $result")

    } catch (ex: Exception) {
        println(ex.message)
    }

}