package com.kotlin.fundamentos.atributos

class Carro(val cor: String, val anoFabricacao: Int) {
}

fun main(){
    var carro = Carro("Preto", 2022)
    println("Cor: " + carro.cor +", Ano de fabricação: "+ carro.anoFabricacao)
}