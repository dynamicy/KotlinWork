package com.examples.kotlin.koans

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0 }

fun main(arg: Array<String>) {
    val numbers1: MutableList<Int> = mutableListOf(1, 2, 3)
    println(containsEven(numbers1))

    val numbers2: MutableList<Int> = mutableListOf(1, 3, 5)
    println(containsEven(numbers2))
}