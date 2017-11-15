import java.util.*

fun main(args: Array<String>) {

    val birthday: Int = readLine()!!.toInt()

    val thisYear = Calendar.getInstance().get(Calendar.YEAR)

    val age = thisYear - birthday

    println("Your age: $age")
}