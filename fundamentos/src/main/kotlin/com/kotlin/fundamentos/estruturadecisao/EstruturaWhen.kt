package com.kotlin.fundamentos.estruturadecisao

fun main(){

    val x = 12

    when(x){
        5 -> println("x = 5")
        8 -> println("x = 8")
        9 -> {
            println("x = 9")
            println("------")
        }
        in 11 .. 15 -> println("Está entre 11 e 15")
        else -> println("Número não mapeado.")
    }

    println(comecaComOi("oi, tudo bem?"))
    println(comecaComOi(5))
}
fun comecaComOi(y: Any): Boolean{
    return when(y){
        is String -> y.startsWith("oi")
        else -> false
    }
}