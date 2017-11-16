fun ArrayList<String>.swap(num1: Int, num2: Int) {
    val temp = this.get(num1)
    this.set(num1, this.get(num2))
    this.set(num2, temp)
}

fun main(args: Array<String>) {

    val list = arrayListOf<String>("apple", "banana", "car", "dog", "elephant")

    println()

    for(x in list) {
        print(" $x ")
    }

    println()

    // after swapping
    list.swap(1,2)

    println()

    for(x in list) {
        print(" $x ")
    }

    println()

}