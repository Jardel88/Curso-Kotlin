package com.kotlin.mercadolivro.enums

enum class Errors(val code: String, val message: String){

    ML0001("ML0001","Invalid Request"),
    ML101("ML-101", "Book [%s] not exists"),
    ML102("ML-102", "Cannot update Book with status [%s]"),
    ML201("ML-201", "Customer [%s] not exists")

}