package com.kotlin.fundamentos.companionobject

class PrimeiraClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    companion object{
        fun criarComValoresPadrao(): PrimeiraClasse{
            return PrimeiraClasse("Maria", "Rua teste", 100)
        }
        fun criarApartirDaSegundaClasse(segundaClasse: SegundaClasse): PrimeiraClasse{
            return PrimeiraClasse(segundaClasse.nome, segundaClasse.endereco, segundaClasse.idade)
        }
    }
}
class SegundaClasse(
    var nome: String,
    var endereco: String,
    var idade: Int
){
    fun criarComValoresPadrao(): PrimeiraClasse{
        return PrimeiraClasse("Maria", "Rua teste", 100)
    }
}
fun main(){
    var segundaClasse = SegundaClasse("nome","endereco", 100)
    var primeiraClasse = PrimeiraClasse.criarComValoresPadrao()
    var primeiraClasse2 = PrimeiraClasse.criarApartirDaSegundaClasse(segundaClasse)
}