package com.kotlin.fundamentos.collections

fun  main(){
    var mapNomeIdade = mapOf("Maria" to 50, "Antonio" to 51)
    println(mapNomeIdade)

    var mapNomeIdade2 = mutableMapOf("Maria" to 50, "Antonio" to 51)
    mapNomeIdade2.put("José", 40)//adiciona chave e valore a lista
    mapNomeIdade2["maria2"] = 60 //adiciona chave e valore a lista
    println(mapNomeIdade2)

    mapNomeIdade2["Antonio2"] = 60
    mapNomeIdade2["Antonio2"] = 90 //Adcionar um valor com a mesma chave subscreve o valor anterior
    mapNomeIdade2.putIfAbsent("Antonio2",95)//Só adiciona o elemento a lista se a chave não existir
    mapNomeIdade2.putIfAbsent("Antonio3",95)
    println("Chaves iguais: " + mapNomeIdade2)

    mapNomeIdade2.remove("maria2")
    println(mapNomeIdade2)
}

