package com.kotlin.fundamentos.nullsafety

fun main(){
    var nome: String? = null

    var tamanho: Int = nome?.length ?: 0

    println(tamanho)
}