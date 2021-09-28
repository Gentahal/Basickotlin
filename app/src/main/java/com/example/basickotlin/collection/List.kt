package com.example.basickotlin.collection

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b' , 'c')
    val anyList = listOf('a', "kotlin",3, true)


    println(anyList)
    println(anyList[2]) //apakah index ketika di array tersebut

    //mutable list
    val mutableList = mutableListOf('a' , "Kotlin" , 3, true)
    mutableList.add('d')//menambah item di akhir
    println(mutableList)
    mutableList.add(2, "My")//menambah item pada index ke -1
    println(mutableList)
    mutableList[3] = false // mengubah nilai item pada index ke-3
    println(mutableList)
    mutableList.removeAt(1)//mengubah item user() berdasarkan index atau posisi di dalam array
    println(mutableList)

}