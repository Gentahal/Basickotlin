package com.example.basickotlin
class Siswa (val name : String, val age : Int){
    override fun toString(): String {
        return "DataSiswa(name$name, age =$age)"
    }
}

data class DataSiswa ( var name : String,var age : Int, var umur:String)

fun main() {
    val siswa = Siswa (  "Paiq",  4 )
    var dataSiswa = DataSiswa ( "Lukman",  5,"Abdi" )
    //equals()
    val dataSiswa1 = DataSiswa ( "Genta", 20,"Arman")
    val dataSiswa2 = DataSiswa ( "Lukman", 5, "Galang")
    println(dataSiswa.equals(dataSiswa1))
    println(dataSiswa.equals(dataSiswa2))
    //copy()
    val dataSiswa4 = dataSiswa2.copy()
    println(dataSiswa4)

    println(siswa)
    println(dataSiswa)
    //component
    val name = dataSiswa.component1()
    val umur = dataSiswa.component2()
    val kkk = dataSiswa.component3()
    println("$name adalah component 1 dari variable dataSiswa1")
}