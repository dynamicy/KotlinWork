package com.examples.kotlin

data class Member(val name: String?, val level: Int?) {

    init {

        checkNotNull(name) {
            "This can't be null"
        }

        checkNotNull(level) // There is a default message too

        require(level ?: 0 > 1) { // defenitely not these kind of conditions :P
            "Custom message for IllegalArgumentException"
        }
    }
}


fun main(args: Array<String>) {

    val data = Member("Chris", 12)

    println("Level: ${data.level}, Name: ${data.name}")
}