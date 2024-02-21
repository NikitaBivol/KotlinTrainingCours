fun main() {
//    логические операторы
//    операторы сравнения и присваивания



    fun getSolutijn() {
        val userAge = 66
// val comparisonResult: Boolean = userAge >= AGE_OF_MAJORITY && userAge <= RETIRMET_AGE
        val comparisonResult: Boolean = userAge in AGE_OF_MAJORITY..RETIRMET_AGE
        var solutionText = ""
        if (comparisonResult == true) {
            solutionText = "конечно"
        }
        else {
            solutionText = "нет"
        }
    }

    println("Пользователю открыт доступ к ресурсу: $solutionText")
}

const val AGE_OF_MAJORITY = 18
const val RETIRMET_AGE = 65