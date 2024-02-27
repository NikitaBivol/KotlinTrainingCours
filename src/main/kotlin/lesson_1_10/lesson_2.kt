fun main() {
    val a = 10
    val b = 3
    val division = a / b

    println(division)

    val intNum1: Int = 10
    val intNum2: Int = 3
    val divisionInt = (intNum1 / intNum2)
    println("делим Int: $intNum1 / $intNum2, получаем:  $divisionInt")
    println("_________________________________________________________")

    val floatNum1: Float = 10f
    val floatNum2: Float = 3f
    val divisionFloat = (floatNum1 / floatNum2)
    println("делим Float: $floatNum1 / $floatNum2, получаем:  $divisionFloat")
    println("_________________________________________________________")

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
    val divisionDouble =  (doubleNum1 / doubleNum2)
    println("делим Double: $doubleNum1 / $doubleNum1, получаем:  $divisionDouble")
    println("_________________________________________________________")


    println(doubleNum1::class.simpleName)
    println(doubleNum1::class)
}