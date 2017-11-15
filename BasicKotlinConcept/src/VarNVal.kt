/**
 * Variable v.s. Value
 */
fun main(args: Array<String>) {

    val name: String = "Chris"

    val description: String = " is a nerd!"

    var age: Int = 10

    var tall: Double = 170.8

    println(name + description + " Age: " + age + ", tall: " + tall + " cm.")

    age = 20

    tall = 170.9

    println(name + description + " Age: " + age + ", tall: " + tall + " cm.")

}