fun main() {

    val spase = 'd'
    val spase2 = "dd"
    val text = "Какой-то текст длиной "
    println(spase2::class)
    println(spase::class)
    println("$text${40 + 2} символа")

    val multiString = """
         |строка1
          |строка2
                 |строка3
    """.trimMargin()
    println(multiString)
}