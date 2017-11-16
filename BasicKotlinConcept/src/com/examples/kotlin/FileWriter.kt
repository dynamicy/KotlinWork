package com.examples.kotlin

import java.io.FileWriter

class TextWriter {

    fun write(str: String) {

        var file: FileWriter? = null

        try {
            file = FileWriter(str, true)
            file.write(str)

        } catch (ex: Exception) {
            println(ex.message)
        } finally {
            file!!.close()
        }

    }

    fun writeLine() {
        val temp = readLine()!!
        write(temp)
    }
}

fun main(arg: Array<String>) {

    val textWriter = TextWriter()

    textWriter.writeLine()
}