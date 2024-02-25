fun main() {

    val userAge = readln()!!.toInt()

    val resultText = if (userAge >= AGE_OF_MAJORITY) "Доступ открыт"
    else if (userAge == 16 || userAge == 17) "Вам 16 или 17"
    else "Доступ закрыт"

//    println(resultText)

    val consoleNumber = when(userAge) {
        10 -> {
            println("Дополнительное действие по числу 10")
            "Ввели число 10"}
        20 -> "Ввели число 30"
        30 -> "Ввели число 20"
        40 -> "Ввели число 40"
        else -> "Ввели другое число"
    }
    println(consoleNumber)
}

//const val AGE_OF_MAJORITY = 18
