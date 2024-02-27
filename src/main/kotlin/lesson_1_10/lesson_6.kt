//циклы while, do wnile

fun main() {
    var counter = 5
    var sleepCounter = 1000

    while (counter > 0) {
        println("Реклама закончится через ${counter--}")
        Thread.sleep(1000)

    }
    println("все")
}
