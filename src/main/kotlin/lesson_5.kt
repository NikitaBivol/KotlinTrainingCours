fun main() {

    val userAge = readln()!!.toInt()

    if(userAge >= AGE_OF_MAJORITY) {
        println("Доступ открыт")
    } else if (userAge == 16 || userAge == 17) {
        println("Вам 16 или 17")
    }
    else {
        println("Доступ закрыт")
    }



}

const val AGE_OF_MAJORITY = 18