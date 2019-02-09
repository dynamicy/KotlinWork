package com.examples.kotlin.jam

fun joinOptions(options: Collection<String>) = options.joinToString(prefix = "[", postfix = "]")

fun main(arg: Array<String>) {

    val numbers: MutableList<String> = mutableListOf("1", "2", "3")
    println(joinOptions(numbers))
}