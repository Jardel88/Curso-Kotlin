package com.kotlin.mercadolivro.exception

class NotFoundException(override val message: String, val errorCode: String): Exception(){
}