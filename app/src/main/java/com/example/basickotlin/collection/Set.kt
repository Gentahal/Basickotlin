package com.example.basickotlin.collection

fun main() {
    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
    println(5 in setA)
    val setC = setOf(1,7,5)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)
    println(union)
    println(intersect)
    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5,)//mutable [2] = 6
    //tidak bisa mengubah imuttable
    mutableSet.add(6)
    mutableSet.remove(1)
}