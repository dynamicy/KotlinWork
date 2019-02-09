package com.examples.kotlin.koans

fun foo(name: String, number: Int): String {
    return foo(name, number, false)
}

fun foo(name: String, toUpperCase: Boolean): String {
    return foo(name, 42, toUpperCase)
}

fun foo(name: String): String {
    return foo(name, 42)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)

fun main(arg: Array<String>) {
    println(useFoo())
}