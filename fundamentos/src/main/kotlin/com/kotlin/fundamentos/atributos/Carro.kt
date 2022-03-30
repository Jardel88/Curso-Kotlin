package com.kotlin.fundamentos.atributos

class Carro(var cor: String, var anoFabricacao: Int, val dono: Proprietario) {
}
class Proprietario(var nome: String, var idade: Int){
}

fun main(){
    var carro = Carro("Preto", 2022, Proprietario("Antonio", 30))
    carro.cor = "Branco"
    carro.anoFabricacao = 2021
    println("Cor: " + carro.cor +", Ano de fabricação: "+ carro.anoFabricacao)
    println("Proprietario: " + carro.dono.nome +", Idade: "+ carro.dono.idade)
}