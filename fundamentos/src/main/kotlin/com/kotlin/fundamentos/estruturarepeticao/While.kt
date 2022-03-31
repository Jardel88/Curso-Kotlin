package com.kotlin.fundamentos.estruturarepeticao

fun main(){
    whileMenorQur10()
    println("-----------------")
    doWhileMenorQue10()
}
fun whileMenorQur10(){
    var x = 0
    while (x < 10){
        println(x)
        x++
    }
}
fun doWhileMenorQue10(){
    var x = 0
    do{
        println(x)
        x++
    } while (x < 10)
}