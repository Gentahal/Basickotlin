package com.example.basickotlin

fun main() {
    message()
    message()
    message()
    printMessage("Hello lambada with parameter")
    val length = messageLength("Hello from lambda")
    println("Message length $length")// menghitung jumlah string

}
val messageLength = { message : String -> message.length}


//bentuk function message
//fun message (){
//println("hello from lambda")
    val message = { println("Hello from lambda")}

//lambda menggunakan parameter
    val printMessage = { message : String ->  println(message)}



