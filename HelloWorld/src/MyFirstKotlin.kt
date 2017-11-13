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
    val guest:String = readLine()!!

    println("Guest: " + guest)

    val guestAge:Int = readLine()!!.toInt()

    println("Guest Age: " + guestAge)


}