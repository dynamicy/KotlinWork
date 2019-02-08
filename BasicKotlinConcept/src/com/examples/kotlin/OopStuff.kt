package com.examples.kotlin

enum class Operator {
    ADD,
    SUB,
    MUL,
    DIV;
}

interface op {
    fun div(n1: Double, n2: Double): Double
}

abstract class Operation() {
    fun <T> showMsg(str: T) {
        println("[" + str + "]")
    }
}

open class BasicOperation() : op, Operation() {

    var processName: String? = null

    var num1: Double? = null

    var num2: Double? = null

    init {
        println("Class com.examples.kotlin.Operation")
    }

    open fun add(n1: Double, n2: Double): Double {
        this.processName = Operator.ADD.name
        this.showMsg<String>(this.processName!!)
        return n1 + n2
    }

    override fun div(n1: Double, n2: Double): Double {
        this.processName = Operator.DIV.name
        this.showMsg<String>(this.processName!!)
        return n1 / n2
    }

    fun getName(): String? {
        return this.processName
    }

    fun getNumber1(): Double? {
        return this.num1
    }

    fun getNumber2(): Double {
        return this.num2!!
    }
}

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // 3
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> return "Hello ${mammal.name}"                                         // 5
    }                                                                                   // 6
}

class AdvOperation() : BasicOperation() {

    init {
        println("Class com.examples.kotlin.AdvOperation")
    }

    override fun add(n1: Double, n2: Double): Double {
        this.processName = Operator.ADD.name
        this.showMsg<String>(this.processName!!)
        return n1 + n2 + 100.0
    }

    fun sub(n1: Double, n2: Double): Double {
        this.processName = Operator.SUB.name
        this.showMsg<String>(this.processName!!)
        return n1 - n2
    }

    fun mul(n1: Double, n2: Double): Double {
        this.processName = Operator.MUL.name
        this.showMsg<String>(this.processName!!)
        return n1 * n2
    }

    fun getParenetProcessName(): String? {
        return super.processName
    }
}

fun main(args: Array<String>) {

    // com.examples.kotlin.Operation
    val op1 = BasicOperation()
    println("com.examples.kotlin.BasicOperation->com.examples.kotlin.add(11.0, 12.0) : " + op1.add(10.0, 15.0))

    val result1 = BasicOperation().add(11.0, 12.0)
    println("com.examples.kotlin.BasicOperation->com.examples.kotlin.add(11.0, 12.0) : $result1 ")

    // com.examples.kotlin.AdvOperation
    val op2 = AdvOperation()
    println("com.examples.kotlin.BasicOperation->com.examples.kotlin.add(10.0, 15.0) : " + op2.add(10.0, 15.0))
    println("Parent Process Name: " + op2.getParenetProcessName())
    println("com.examples.kotlin.BasicOperation->com.examples.kotlin.sub(10.0, 15.0) : " + op2.sub(10.0, 15.0))
    println("Parent Process Name: " + op2.getParenetProcessName())

    val result2 = AdvOperation().mul(11.0, 12.0)
    println("com.examples.kotlin.AdvOperation->com.examples.kotlin.mul(11.0, 12.0) : $result2 ")
    println("Parent Process Name: " + op2.getParenetProcessName())

    val result3 = AdvOperation().div(22.0, 2.0)
    println("com.examples.kotlin.AdvOperation->com.examples.kotlin.div(22.0, 2.0) : $result3 ")

    // Override
    val op3 = AdvOperation()
    val result4 = op3.add(10.0, 10.0)
    println("com.examples.kotlin.AdvOperation->com.examples.kotlin.div(10.0, 10.0) + 100.0 : $result4 ")
    println("com.examples.kotlin.BasicOperation->com.examples.kotlin.add(10.0, 10.0) : " + BasicOperation().add(10.0, 10.0))

    // Casting
    val op4 = AdvOperation() as BasicOperation
    println("com.examples.kotlin.BasicOperation->com.examples.kotlin.add(10.0, 15.0) : " + op4.add(10.0, 15.0))

    // Abstract
    op4.showMsg("It's fun!")

    // Seal
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("John", "Engineer")))
}