package com.kotlin.fundamentos.estruturadecisao

fun main(){
    parOuImpar(2)
    parOuImpar(3)
    println("-----------------")
    println(parOuImparReturn(2))
    println(parOuImparReturn(3))
    println("-----------------")
    resultadoNota(3)
    resultadoNota(4)
    resultadoNota(5)
    resultadoNota(6)
}
fun parOuImpar(numero: Int){
    if (numero % 2 == 0){
        println("Par")
    } else {
        println("Impar")
    }
}

fun parOuImparReturn(numero: Int): String{
    return if (numero % 2 == 0){
       "Par"
    } else {
        "Impar"
    }
}

fun resultadoNota(nota: Int){
    if (nota >= 6){
        println("Aprovado")
    } else if (nota == 4 || nota == 5){
        println("Recuperação")
    } else{
        println("Reprovado")
    }
}