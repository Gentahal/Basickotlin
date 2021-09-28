package com.example.basickotlin.collection

fun main() {
    val capital = mapOf(
    "Jakarta" to "Indonesia",
    "Madrid" to "Spain",
    "Dayeh"  to "bogor"
    )
    val mapKeys =capital.keys
    val mapValues = capital.values
    println(mapKeys)
    println(mapValues)
    println(capital["Jakarta"])
    println(capital.getValue(  "Madrid"))
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital)
}