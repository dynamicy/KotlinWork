package com.examples.kotlin

@Deprecated("retired", ReplaceWith("println(\"Do something\")"), level = DeprecationLevel.WARNING)
fun doSomething() {
    println("Do something")
}

fun main(args: Array<String>) {
    doSomething()
}