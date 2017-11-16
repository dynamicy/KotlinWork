open class Operation() {

    var processName: String? = null

    var num1: Double? = null

    var num2: Double? = null

    init {
        println("Class Operation")
    }

    fun add(n1: Double, n2: Double): Double {
        this.processName = "Add"
        return n1 + n2
    }

    fun getName(): String? {
        return this.processName
    }

    fun getNumber1(): Double? {
        return this.num1
    }

    fun getNumber2(): Double {
        return this.num2!!
    }
}

class AdvOperation() : Operation() {

    init {
        println("Class AdvOperation")
    }

    fun sub(n1: Double, n2: Double): Double {
        this.processName = "Sub"
        return n1 - n2
    }

    fun mul(n1: Double, n2: Double): Double {
        this.processName = "Mul"
        return n1 * n2
    }

    fun div(n1: Double, n2: Double): Double {
        this.processName = "Div"
        return n1 / n2
    }

    fun getParenetProcessName(): String? {
        return super.processName
    }
}

fun main(args: Array<String>) {

    // Operation
    val op1 = Operation()
    println("Operation->add(11.0, 12.0) : " + op1.add(10.0, 15.0))

    val result1 = Operation().add(11.0, 12.0)
    println("Operation->add(11.0, 12.0) : $result1 ")

    // AdvOperation
    val op2 = AdvOperation()
    println("Operation->add(10.0, 15.0) : " + op2.add(10.0, 15.0))
    println("Parent Process Name: " + op2.getParenetProcessName())
    println("Operation->sub(10.0, 15.0) : " + op2.sub(10.0, 15.0))
    println("Parent Process Name: " + op2.getParenetProcessName())

    val result2 = AdvOperation().mul(11.0, 12.0)
    println("AdvOperation->mul(11.0, 12.0) : $result2 ")
    println("Parent Process Name: " + op2.getParenetProcessName())

    val result3 = AdvOperation().div(22.0, 2.0)
    println("AdvOperation->div(22.0, 2.0) : $result3 ")
    println("Parent Process Name: " + op2.getParenetProcessName())
}