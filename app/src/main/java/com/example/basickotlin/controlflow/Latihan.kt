package com.example.basickotlin.controlflow

fun main() {
    print("Hour:")
    var parkiran = readLine()!!.toInt()
    println(
        parkiran/24 * 15 + (
                if (parkiran >= 24)0
                else Math.min(parkiran,5))+
                Math.max(parkiran%24 - if (parkiran > 24)0 else 5,0) * 0.5
                )

}