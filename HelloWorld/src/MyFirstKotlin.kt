import java.math.BigDecimal

fun main(args: Array<String>) {

    /**
     * Basic Output
     */
    print("Welcome to Kotlin!\n")

    print(100)

    println()

    /**
     * Variable v.s. Value
     */
    val name: String = "Chris"

    val description: String = " is a nerd!"

    var age: Int = 10

    var tall: Double = 170.8

    println(name + description + " Age: " + age + ", tall: " + tall + " cm.")

    age = 20

    tall = 170.9

    println(name + description + " Age: " + age + ", tall: " + tall + " cm.")

    /**
     * Basic Input
     */
    val guest: String = readLine()!!

    println("Guest: " + guest)

    val guestAge: Int = readLine()!!.toInt()

    println("Guest Age: " + guestAge)

    /**
     * Null Safety
     */
    var pi: Double?

    pi = null

    println(pi)

    // This will throw an exception
//    println(pi!!)

    /**
     * Convert between Data Type
     */
    var piStr = "3.14"
    var piDouble : Double
    var piFloat : Float
    var piBigDecimal : BigDecimal

    piDouble = piStr.toDouble()

    println("Pi in double: " + piDouble)

    piFloat = piStr.toFloat()

    println("Pi in float: " + piFloat)

    piBigDecimal = BigDecimal(piStr)

    println("Pi in bigDecimal: " + piBigDecimal)


}