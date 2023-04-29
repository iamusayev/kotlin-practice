package az.iamusayev.kotlin.topics

import java.util.*

fun main() {
    println(testSimple(3, 10)) // 10
    println(testString(1))
    println(testNamedArguments(y = 1, z = 2, x = 3))
    var numbers = intArrayOf(1, 2, 32, 13, 213, 21)
    printEven(*numbers, 1, 2, 2, 32)
}

fun testSimple(x: Int, y: Int) = x + y

fun testString(x: Int): String {
    return "String is $x";
}

//Named arguments
fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//void
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

//В котлине не нужна перегрузка методов потому что у нас есть аргументы по умолчанию
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.uppercase(Locale.getDefault()) else name) + number
}

//vararg - это когда мы в функцию передаем любое количество аргументов
fun printEven(vararg numbers: Int) {
    for (number in numbers)
        if (number % 2 == 0) println(number)
}