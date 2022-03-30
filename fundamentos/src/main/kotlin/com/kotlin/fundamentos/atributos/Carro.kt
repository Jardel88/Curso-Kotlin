package com.kotlin.fundamentos.atributos

class Carro(var cor: String, var anoFabricacao: Int) {
}

fun main(){
    var carro = Carro("Preto", 2022)
    carro.cor = "Branco"
    carro.anoFabricacao = 2021
    println("Cor: " + carro.cor +", Ano de fabricação: "+ carro.anoFabricacao)
}