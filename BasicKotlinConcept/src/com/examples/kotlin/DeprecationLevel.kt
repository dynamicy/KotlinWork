package com.examples.kotlin

@Deprecated("retired", level = DeprecationLevel.WARNING)
fun doSomething() {
    println("Do something")
}

@Deprecated("replace", ReplaceWith("Joiner.on(sep).join(strings)", imports = ["com.google.common.base.Joiner"]))
fun doAction() {
    println("Do action")
}

fun main(args: Array<String>) {
    doSomething()

    doAction()
}