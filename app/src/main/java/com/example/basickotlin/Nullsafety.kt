package com.example.basickotlin

fun main() {

    //membuat null dan melakukan pengecekan dengan if else
    val b = 12
    if (b != null){
        println(b)
}else {
        println("Variable b adalah null")
    }
    //cara ke2 mengatasi null
    val a : String? = null
    println(a?.length)

//cara ke3 mengatasi null
    val c :String? = null
    val k :Int = if (c != null) c.length else -1
    println(k)
    //elvis  operator val l
    var l = c?.length
    println(l)
    //operator
    val e :String? = null
    println(e?.length) /* error kerana datanya beneran null */

}