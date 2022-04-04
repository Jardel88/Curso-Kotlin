package com.kotlin.fundamentos.nullsafety

import com.kotlin.fundamentos.classe.Pessoa

fun main(){
    val pessoa: Pessoa? = Pessoa("Maria", 50)
    println(pessoa!!.nome)
}