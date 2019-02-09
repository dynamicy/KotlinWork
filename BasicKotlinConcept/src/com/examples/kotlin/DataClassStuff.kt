package com.examples.kotlin

data class User(val name: String, val age: Int)

data class Person(val firstName: String, val lastName: String)

fun main(args: Array<String>) {
    val jack = User("jack", 29)
    println("name = ${jack.name}")
    println("age = ${jack.age}")

    val Chris = Person("Chris", "Evans")
    println("First Name: ${Chris.firstName}, Last Name: ${Chris.lastName}")
    println("Hash Code: ${Chris.hashCode()}")

    println("To String: ${Chris.toString()}")

    val John = Chris.copy(firstName = "John")
    println("First Name: ${John.firstName}, Last Name: ${John.lastName}")

    println("Equals: ${Chris.equals(John)}")

    val ChrisClone = Chris.copy()
    println("Hash Code: ${ChrisClone.hashCode()}")
    println("Equals: ${Chris.equals(ChrisClone)}")

}