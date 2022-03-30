package com.kotlin.fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, Idade: ${idade}"
    }
}
fun main(){
   var nome = Pessoa("Antonio", 30)
    println(nome)
}