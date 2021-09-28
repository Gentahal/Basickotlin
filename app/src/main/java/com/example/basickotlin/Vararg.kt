package com.example.basickotlin

import java.lang.NumberFormatException

fun main() {
    val number = sumNumber (10, 20 ,30, 40)
    println(number)

    val arrayNumber = arrayOf(1, 2, 3, 4,)
    println(sumNumber(arrayNumber))

    val number1 = intArrayOf(10, 20, 30)
    val numbers = sumNumbers(10, 20, 30, 40, 50,*number1)
    println(numbers)
}

fun sumNumbers(vararg number: Int) : Int{
    return number.sum()
}
fun sumNumber(vararg number: Int): Int{
    return number.sum()
}
fun sumNumber(number: Array<Int>): Int {
    return number.sum()
}