fun main() {
//    диапозоны (интервалы)
    
    val range: IntRange = 42..442
    val range1: IntRange = 42 until 442
    val range2: LongRange = 42L..442L
    val range3: CharRange = 'a'..'z'
    val range4: ClosedFloatingPointRange<Double> = 42.1..442.1
    val range5: ClosedFloatingPointRange<Float> = 42.1f..442.1f
    val range6 = 42..442 step 2

    val a = 52 in range1
    val b = 52 !in range1


//    for
//    break, continue, return

    for(i in 5 downTo 1 ) {
        if(i == 3) {
//            println("Пользователь нажал \"Пропустить\"")
//            break
//            println("i == 3, i не будет распечатан")
//            continue
            return
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)

    }

    println("---------------------------------")
    println("Все прошло успешно")


//    for(i in range1 step 8) {
//        println(i)
////        Thread.sleep(200)

    }
