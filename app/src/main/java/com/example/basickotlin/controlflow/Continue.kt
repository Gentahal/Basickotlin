package com.example.basickotlin.controlflow

fun main() {
    var sum = 0
    var i = 1
    while (i <= 10) {
        i++
        if( i%2 != 0 ) {
            continue
        }
        sum += i
        println(sum)
    }
}