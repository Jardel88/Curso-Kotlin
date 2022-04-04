package com.kotlin.fundamentos.collections

fun main(){
    var lista = listOf(1,2,3,4,6)
    val pares = lista.filter { it % 2 == 0 }//filter itera sobre todos os valores o it é o indice do elemento da vez
    val primeiro = lista.first()
    val ultimo = lista.last()
    println(pares)
    println(primeiro)
    println(ultimo)
    println("---------------------------")
   lista.forEach{
        println(it)
    }
    println("---------------------------")
    for (numero in lista){
        println(numero)
    }
    println("---------------------------")
    println(lista[0])
    println(lista.get(3))
    println(lista.size)
    println(lista.indexOf(6))

    println("---------------------------")
    var lista2 = mutableListOf(1,2)
    println(lista2)
    lista2[0] = 30 //subscrever o valor de uma lista
    println(lista2)
    lista2.add(3)
    lista2.removeAt(0)//remove pelo index
    lista2.remove(2)//remove pelo nome do objeto
    println(lista2)
}