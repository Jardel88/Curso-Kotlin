package com.kotlin.mercadolivro.controllers

import com.kotlin.mercadolivro.controllers.request.PostBookRequest
import com.kotlin.mercadolivro.controllers.request.PutBookRequest
import com.kotlin.mercadolivro.extension.toBookModel
import com.kotlin.mercadolivro.model.BookModel
import com.kotlin.mercadolivro.services.BookService
import com.kotlin.mercadolivro.services.CustomerService
import net.bytebuddy.asm.Advice.Return
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
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

    @GetMapping
    fun findAll(): List<BookModel>{
        return bookService.findAll();
    }
    @GetMapping("/active")
    fun findActives(): List<BookModel>{
        return bookService.findActives()
    }
//    @GetMapping("/active")
//    fun findActives(): List<BookModel> =
//        bookService.findActives()
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): BookModel{
        return bookService.findById(id)
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int){
        bookService.delete(id)
    }
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable id: Int, @RequestBody book: PutBookRequest){
        val bookSaved = bookService.findById(id)
        bookService.update(book.toBookModel(bookSaved))
    }

}