package com.examples.kotlin

/**
 * Null Safety
 */
fun main(args:Array<String>) {

    var pi: Double?

    pi = null

    println(pi)

    // This will throw an exception
    println(pi!!)
}