package com.examples.kotlin

/**
 * Return and Jump
 */
fun main(args: Array<String>) {

    for (x in 1..10) {
        for (y in 1..10) {
            if (x == 4 && y == 5) {
                break
            }
            print(" " + x * y + " ")
        }
        println()
    }

    println()

    loop1@ for (x in 1..10) {
        for (y in 1..10) {
            if (x == 4 && y == 5) {
                break@loop1
            }
            print(" " + x * y + " ")
        }
        println()
    }
}