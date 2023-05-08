fun main() {
    val items = listOf("apple", "banana", "orange")
    for (item in items)
        println(item)

    //while
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }

    //Diapasons
    print(5 in 3..10)
    for (i in 1..10)
        println(i)

    //от 1 до 10 не включительно
    for (i in 1 until 10)
        println(i)

    //from 10 to 1
    for (i in 10 downTo 1)
        println(i)

    for (i in 0..100 step 10)
        println(i)
}