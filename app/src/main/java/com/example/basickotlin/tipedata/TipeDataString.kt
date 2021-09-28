package com.example.basickotlin.tipedata

fun main(){
    val abc = "Genta"
    val bca = "Hal"
    val alamatRumah = """
        Karawang 
        Jawa Barat 
        Indonesia
    """.trimIndent()
    println(abc)
    println(alamatRumah)
    val fullName = abc + " " + bca + alamatRumah
    println(fullName)
    val ghc = "paik"
    val chg = "beban"
    val fgh = "$ghc ${chg.length}"
    println(ghc)
    println(chg)
    println(fgh)
    val a : String = "paik"
    println("${a.length}")

}