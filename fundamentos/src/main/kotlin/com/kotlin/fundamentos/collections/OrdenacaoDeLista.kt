package com.kotlin.fundamentos.collections

fun main(){
    var lista = mutableListOf(9,8,7,6,5,4,3,2,1)
    println(lista)
    lista.sort()
    println(lista)
    lista.shuffle()
    println(lista)
    println(lista.contains(3))
    println(lista.contains(0))

}