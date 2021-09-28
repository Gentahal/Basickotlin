package com.example.basickotlin.tipedata

fun main(){
    val enemy : Array<String> = arrayOf("paik" , "arman" , "Abdi" )
    val eenemy : Array<Any> = arrayOf(1 , "jakwan" , "lukman")

for (a in eenemy)
    println(a)
    for (i in enemy)
        println(i)

    println()
    val name : Array<Any> = arrayOf( "paik" , "stupid", true , 1)
    println(name[0])
    println(name.get(1))

    name.set(2, "Beban")
    println(name[2])
    val abc : Array<String?> = arrayOfNulls(2)
    abc.set(0, null)
    abc.set(1,"jakwan")
     for (a in abc)
         println(a)





}