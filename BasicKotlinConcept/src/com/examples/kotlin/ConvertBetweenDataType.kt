package com.examples.kotlin

import java.math.BigDecimal

/**
 * Convert between Data Type
 */
fun main(args:Array<String>) {

    var piStr = "3.14"
    var piDouble: Double
    var piFloat: Float
    var piBigDecimal: BigDecimal

    piDouble = piStr.toDouble()

    println("Pi in double: " + piDouble)

    piFloat = piStr.toFloat()

    println("Pi in float: " + piFloat)

    piBigDecimal = BigDecimal(piStr)

    println("Pi in bigDecimal: " + piBigDecimal)

}