package com.example.basickotlin.controlflow

fun main(){
    val gradeUjian =80
    if (gradeUjian >=90) {
        println("Kamu mendapatakan nilai A++")
    }else if (gradeUjian >= 80) {
        println("kamu mendapatkan nilai A-")
    }else{
        println("Kamu belum lulus")
    }
}