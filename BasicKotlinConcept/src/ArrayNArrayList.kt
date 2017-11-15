fun main(args: Array<String>) {

    /**
     * Array
     */
    val intArray = Array<Int>(5) { 0 }

    val numbers: IntArray = intArrayOf(10, 20, 30, 40, 50)

    val strArray = arrayOf("this", "is", "an", "apple")

    val stringsOrNulls = arrayOfNulls<String>(10)

    for (i in 0..numbers.size - 1) {
        print(" " + numbers[i] + " ")
    }

    println()

    for (i in 0..intArray.size - 1) {
        print(" " + intArray[i] + " ")
    }

    println()

    for (i in 0..strArray.size - 1) {
        print(" " + strArray[i] + " ")
    }

    println()

    for (i in 0..stringsOrNulls.size - 1) {
        print(" " + stringsOrNulls[i] + " ")
    }

    /**
     * ArrayList
     */
    val strArrayList = ArrayList<String>()

    strArrayList.add("this")
    strArrayList.add("is")
    strArrayList.add("an")
    strArrayList.add("apple")

    for(item in strArrayList) {
        print(item)
    }

    println()

    if(strArrayList.contains("a")) {
        println("Contains a!")
    } else {
        println("Do not contains a!")
    }

    println()

    if(strArrayList.contains("apple")) {
        println("Contains apple!")
    } else {
        println("Do not contains apple!")
    }

}