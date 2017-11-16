var result:Double = 0.0

fun add(n1: Double, n2: Double): Double {
    return n1 + n2
}

fun add(n1: Int, n2: Int): Int {
    return n1 + n2
}

fun add(n1: Double, n2: Double, n3: Double): Double {
    return n1 + n2 + n3
}

fun sub(n1: Double, n2: Double): Double {
    return n1 - n2
}

fun sub(n1: Int, n2: Int): Int {
    return n1 - n2
}

fun mul(n1: Double, n2: Double): Double {
    return n1 * n2
}

fun div(n1: Double, n2: Double): Double {
    return n1 / n2
}

fun modifyResult():Double {
    result = 99.99
    return result
}

fun main(args: Array<String>) {

    val n1 = readLine()!!.toDouble()
    val n2 = readLine()!!.toDouble()

    println("Add: " + add(n1, n2))
    println("Sub: " + sub(n1, n2))
    println("Mul: " + mul(n1, n2))
    println("Div: " + div(n1, n2))

    val n3 = readLine()!!.toDouble()

    println("Add: " + add(n1, n2, n3))

    val n4 = readLine()!!.toInt()
    val n5 = readLine()!!.toInt()

    println("Add: " + add(n4, n5))
    println("Sub: " + sub(n4, n5))

    val result = 100

    println(result)

    println(modifyResult())

}