package com.kotlin.mercadolivro.controllers

import com.kotlin.mercadolivro.controllers.request.PostBookRequest
import com.kotlin.mercadolivro.controllers.request.PutBookRequest
import com.kotlin.mercadolivro.controllers.response.BookResponse
import com.kotlin.mercadolivro.extension.toBookModel
import com.kotlin.mercadolivro.extension.toResponse
import com.kotlin.mercadolivro.services.BookService
import com.kotlin.mercadolivro.services.CustomerService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.web.PageableDefault
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


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
    fun findAll(@PageableDefault(page = 0, size = 10) pageable: Pageable): Page<BookResponse>{
        return bookService.findAll(pageable).map { it.toResponse() }
    }
    @GetMapping("/active")
    fun findActives(@PageableDefault(page = 0, size = 10) pageable: Pageable): Page<BookResponse>{
        return bookService.findActives(pageable).map { it.toResponse() }
    }
//    @GetMapping("/active")
//    fun findActives(): List<BookResponse> =
//        bookService.findActives().map { it.toResponse() }
    @GetMapping("/{id}")
    fun findById(@PathVariable id: Int): BookResponse{
        return bookService.findById(id).toResponse()
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