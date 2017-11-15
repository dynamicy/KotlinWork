/**
 * Loop Control
 */
fun main(args: Array<String>) {
    for (x in 1..9) {
        for (y in 1..8) {
            print(" " + x * y + " ")
        }
        println()
    }

    println()

    var x = 1
    var y = 1
    while (x <= 9) {
        while (y <= 8) {
            print(" " + x * y + " ")
            y++
        }
        y = 1
        x++
        println()
    }

    println()

    x = 1
    y = 1
    do {
        do {
            print(" " + x * y + " ")
            y++
        } while (y <= 8)
        y = 1
        x++
        println()
    } while (x <= 9)
}