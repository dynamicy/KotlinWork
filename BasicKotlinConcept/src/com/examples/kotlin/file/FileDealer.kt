package com.examples.kotlin.file

import java.io.BufferedReader
import java.io.File
import java.io.FileWriter

class TextDealer {

    fun showMenu() {

        var option: Int? = null

        try {
            option = readLine()!!.toInt()
        } catch (ex: Exception) {
            println(ex.message)
        }

        when (option) {
            1 -> {
                writeLine()
                showMenu()
            }
            2 -> {
                read()
                showMenu()
            }
            0 -> {
                menu()
                showMenu()
            }
        }
    }

    fun menu() {
        println("0) Show menu")
        println("1) Write file")
        println("2) Read file")
    }

    fun read() {

        val file: BufferedReader?

        try {
            file = File("test.txt").bufferedReader()

            val inputString = file.use { it.readText() }
            println(inputString)
        } catch (ex: Exception) {
            println(ex.message)
        }
    }

    fun write(str: String) {

        var file: FileWriter? = null

        try {
            file = FileWriter("test.txt", true)
            file.write(str)
            file.close()
        } catch (ex: Exception) {
            println(ex.message)
        }

    }

    fun writeLine() {
        val temp = readLine()!!
        write(temp)
    }
}

fun main(arg: Array<String>) {

    val textDealer = TextDealer()

    textDealer.menu()

    textDealer.showMenu()

}