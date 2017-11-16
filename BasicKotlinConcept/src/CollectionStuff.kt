/**
 * Collection
 */
fun main(args: Array<String>) {

    //hashMapOf
    val hashMap = hashMapOf("a" to "apple", "b" to "banana", "c" to "car")
    hashMap.put("d", "dog")
    hashMap.put("e", "elephant")

    println()

    for (x in hashMap.keys) {
        print(" " + hashMap.get(x) + " ")
    }

    println()

    // arrayOf
    val array = arrayOf(1, 2, 3, 4)

    println()

    for (x in 0..array.size - 1) {
        print(" " + array[x] + " ")
    }

    println()

    // listOf
    val list = listOf<String>("ant", "bolt", "cardinal")

    println()

    for (x in list) {
        print(" $x ")
    }

    println()

    // mutableListOf
    val mutableList = mutableListOf<String>("Angela", "Bob", "Chris")

    println()

    for (x in mutableList) {
        print(" $x ")
    }

    println()

    // setOf
    val set = setOf<Int>(1, 2, 3, 5, 6, 7, 88, 43, 43, 43)

//    set.add(33) // it doesn't work

    println()

    for(element in set) {
        print(" $element ")
    }

    println()

    // setOf
    val mutableSet = mutableSetOf<Int>(1, 2, 3, 5, 6, 7, 88, 43, 43, 43)

    mutableSet.add(43)
    mutableSet.add(99)

    println()

    for(element in mutableSet) {
        print(" $element ")
    }

    println()
}