package com.examples.kotlin

import kotlin.concurrent.thread

class MyThread() : Thread() {

    var threadName: String? = null

    constructor(threadName: String) : this() {

        this.threadName = threadName

        println("$threadName start!")
    }

    override fun run() {

        super.run()

        for (i in 1..10) {

            println(" $threadName -> $i ")

            try {
                Thread.sleep(1000)
            } catch (ex: Exception) {
                println(ex.message)
            }

        }
    }

}

fun main(args: Array<String>) {

    val thread1 = MyThread("thread1")
    thread1.start()

    val thread2 = MyThread("thread2")
    thread2.start()
    thread2.join()

    object : Thread() {
        override fun run() {
            println("running from Thread: ${Thread.currentThread()}")
        }
    }.start()

    Thread({
        println("running from lambda: ${Thread.currentThread()}")
    }).start()

    thread(start = true) {
        println("running from thread(): ${Thread.currentThread()}")
    }
}
