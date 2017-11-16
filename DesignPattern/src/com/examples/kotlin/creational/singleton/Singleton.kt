package com.examples.kotlin.creational.singleton

class Singleton private constructor() {

    private var name: String? = null

    companion object {
        val instance: Singleton by lazy {
            Singleton()
        }
    }

    fun getName():String? {
        return this.name
    }

    fun setName(name:String) {
        this.name = name
    }

    init {
        println("Constructor created")
    }
}

fun main(args: Array<String>) {

    val obj1 = Singleton.instance
    obj1.setName("Chris")
    println(obj1.getName())

    val obj2 = Singleton.instance
    println(obj2.getName())

    val obj3 = Singleton.instance
    println(obj3.getName())

    obj3.setName("Chris Evans")
    println(obj3.getName())
    println(obj1.getName())
    println(obj2.getName())
}