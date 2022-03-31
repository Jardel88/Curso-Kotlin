package com.kotlin.fundamentos.estruturarepeticao

fun main(){
    printa1a10()
    printa10a1()
    printaPar1a10()
}
fun printa1a10(){
    for (numero in 1 .. 10){
        println(numero)
    }
}
fun printa10a1(){
    for (numero in 10 downTo  1){
        println(numero)
    }
}
fun printaPar1a10(){
    for (numero in 2 .. 10 step 2){
        println(numero)
    }
}