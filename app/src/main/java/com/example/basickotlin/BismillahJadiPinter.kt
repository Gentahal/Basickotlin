package com.example.basickotlin

import kotlin.concurrent.timer

fun main(){
    var jam = 25
    when(jam) {
        in 1..5 -> println("bayar parkir sebanyak\$${jam * 1.0}")//jam 1-5 itu $5
        in 6..23 -> println("bayar parkir sebnyak\$${((jam - 5.0) * 0.5) +5}")//jam setelahnya 6-23 itu=0,5
        else -> println("bayar parkir sebanyak\$${(jam % 24.0) * 0.5 + (jam/24 * 15)} ")//24 jam=$15
    }
    hitungParkir( 50)
}

fun hitungParkir(waktu: Int){
    if (waktu >= 0 && waktu <=5){
        print("tagihan parkir sebanyak $${waktu*1}")
    }else if(waktu > 5 && waktu <= 24){
        print("tagihan parkir sebanyak$${5 + ((waktu - 5)*0.5)}")
    }else if(waktu % 24 == 0 ) {

    }
}