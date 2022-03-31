package com.kotlin.fundamentos.nullsafety

fun main(){

    var nome: String? = null
    var nome2: String? = "Maria"

    if (nome != null){
        println(nome.length)
    }
    println(nome?.length)
    println(nome2?.length?.toShort())// ? Faz uma verificação se o valor é nulo, se não for, chama o que vem depois

    //--------------------------------------------------------------------------------------

    //var toShort: Short = nome2?.length?.toShort()
      var toShort: Short = nome2!!.length.toShort()// !! Ignora se o valor é nulo ou não e chama o que vem depois
}