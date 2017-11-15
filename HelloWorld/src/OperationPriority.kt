/**
 * Operation Priority
 *
 * 1. ()
 * 2. ++, --
 * 3. ^
 * 4. *, /
 * 5. +, -
 * 6. =
 */
fun main(args: Array<String>) {

    /**
     * Part 1
     */
    var n1 = 10
    var n2 = 11
    var n3 = --n1 + n2

    println("n3: $n3")
// 20
    /**
     * Part 2
     */
    var n4 = n1++ + n2
//    20
    println("n4: $n4")
//    10
    println("n1: $n1")
}