// коллекции, списки, мапы
// list
// set
// map
fun main() {
    val list = listOf(2, 3, 4)

    val mutableList = mutableListOf(11, 15, 17, 20, 34, 9, 42)
//    println(mutableList)

    mutableList.add(42)
    println(mutableList)

    mutableList.add(0, 42)

    println("Список содержит число 43 - ${mutableList.contains(43)}")

    println(mutableList.isEmpty())
    println(mutableList.indexOf(42))

    mutableList.sort()
    println("после сортировки: $mutableList")

    mutableList.sortDescending()
    println("после обпратной сортировки: $mutableList")

    mutableList.reverse()
    println("после reverse: $mutableList")

    mutableList.reverse()
    println("после reverse: $mutableList")

    mutableList.reverse()
    println("после reverse: $mutableList")

    mutableList.forEach {
        println(it)
    }

    val mutableList2 = mutableList.map {
        if(it == 17) {
            it + 100
        }
        else it + 2}

    println(mutableList2)
    println(mutableList)



}