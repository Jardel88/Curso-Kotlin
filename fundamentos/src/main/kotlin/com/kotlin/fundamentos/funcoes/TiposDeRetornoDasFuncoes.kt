package com.kotlin.fundamentos.funcoes

fun retornaNumeroPorExtenso(numero: Int): String{
    if (numero == 5){
        return "Cinco"
    } else if (numero == 8){
        return "Oito"
    }
    return "Numero não mapeado."
}
fun main(){
    println(retornaNumeroPorExtenso(5))
    println(retornaNumeroPorExtenso(8))
    println(retornaNumeroPorExtenso(10))
}