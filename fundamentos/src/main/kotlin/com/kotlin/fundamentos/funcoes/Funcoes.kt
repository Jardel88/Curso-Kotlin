package com.kotlin.fundamentos.funcoes

fun main(){
    dizOi("Maria", 30)
}

fun retornaNome(): String {
    return "Antonio"
}
fun dizOi(nome: String, idade: Int){
    println("Oi ${nome}, sua idade é: ${idade}")
}