package com.examples.kotlin

class Outter() {

    private var name: String? = null

    inner class Inner() {
        fun show() {
            println(name)
        }
    }

    fun setName(name:String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    val outter = Outter()
    val inner = outter.Inner()

    outter.setName("Chris")
    inner.show()
}