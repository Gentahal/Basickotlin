package com.example.basickotlin.controlflow

fun main() {
    for (value in 100 downTo  0 step 5)
        println(value)

    val name = "Paik anak buruk"
    for (name in name) {
        //code
        println("\"$name\"")
    }
    for (index in  (19.downTo (9) step 3)){
        println(index)

        val range = 1.rangeTo(9)
        range.forEachIndexed { index, value ->
            println("index $ index bernilai $value")
        }
    }
}