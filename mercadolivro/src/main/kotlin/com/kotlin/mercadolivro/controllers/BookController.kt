package com.kotlin.mercadolivro.controllers

import com.kotlin.mercadolivro.controllers.request.PostBookRequest
import com.kotlin.mercadolivro.extension.toBookModel
import com.kotlin.mercadolivro.services.BookService
import com.kotlin.mercadolivro.services.CustomerService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("book")
class BookController (
    val bookService: BookService,
    val customerService: CustomerService
){

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody request: PostBookRequest){
       val customer = customerService.getById(request.customerId)
       bookService.create(request.toBookModel(customer))
    }
}