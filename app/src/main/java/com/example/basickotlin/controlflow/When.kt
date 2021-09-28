package com.example.basickotlin.controlflow

fun main(){
    //When
    var x = 9
    when (x){
        1-> println("x = 1")
        2-> println("x = 2")
        else ->{
            println("x tidak memiliki nilai")
        }
    }

    //when expresion multipe option
    var nilaiAkhir = 'A'
    when(nilaiAkhir){
        'A' , 'B' , 'C' -> println("Kamu lulus ujian dengan predikat $nilaiAkhir")
        else ->{
            println("Jangan menyerah , habiskan stock kegagalan-mu")
        }
    }
    val ujianAwal = 'A'
    val nilaiLulus = arrayOf('A','B','C')
    when(nilaiAkhir){
        in nilaiLulus -> println("Kamu lulus")
        !in nilaiLulus -> println("Coba lagi!")
    }
    //When Tanda variable
    val ujianPertengahan = 70
    when{
        ujianPertengahan >= 90 -> println("Anda pelajar terbaik")
        ujianPertengahan >= 80 -> println("Nilai anda cukup")
        else -> println("Belajar yang bener lagi ya.....")
    }
}