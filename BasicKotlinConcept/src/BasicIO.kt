/**
 * Basic Input & Output
 */
fun main(args: Array<String>) {

    print("Welcome!\n")

    println()

    val guestName: String = readLine()!!

    println("Guest Name: " + guestName)

    val guestAge: Int = readLine()!!.toInt()

    println("Guest Age: " + guestAge)
}