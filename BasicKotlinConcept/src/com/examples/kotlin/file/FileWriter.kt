package com.examples.kotlin.file

import java.io.FileWriter

class TextWriter {

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
        write(readLine()!!)
    }
}

fun main(arg: Array<String>) {

    val textWriter = TextWriter()

    textWriter.writeLine()
}