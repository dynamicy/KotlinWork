package com.examples.kotlin

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern() = """\d{2}\ ${month}\ \d{4}"""

fun main(args: Array<String>) {

    val demoStr = " this is an apple. "

    // trim()
    println(demoStr.trim())

    // split
    println(demoStr.split(" "))

    // toLowerCase
    println(demoStr.toLowerCase())

    // toUpperCase
    println(demoStr.toUpperCase())

    // plus
    println(demoStr.plus("banana"))

    // replace
    println(demoStr.replace(" ", "-"))

    // regex
    println("11 MAR 1952".matches(getPattern().toRegex()))
}
