package com.kotlin.fundamentos.collections

fun main(){
    var lista = mutableListOf(3,2,1,1,2,3)
    println("lista: $lista")
    var setNumero = setOf(1,2,3)
    var setNumero2 = setOf(1,2,3,3,2,1)//Unifica os numeros duplicados
    println(setNumero)
    println(setNumero2)
    println(setNumero2.contains(3))
    println(setNumero2.contains(0))


}