package com.kotlin.fundamentos.funcoes

fun main(){
    var nome = retornaNome()
    println("Hell World")
    println(retornaNome())
    println(nome)
}

fun retornaNome(): String {
    return "Antonio"
}