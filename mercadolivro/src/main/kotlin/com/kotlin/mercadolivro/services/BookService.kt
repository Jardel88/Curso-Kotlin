package com.kotlin.mercadolivro.services

import com.kotlin.mercadolivro.model.BookModel
import com.kotlin.mercadolivro.repositories.BookRepository
import org.springframework.stereotype.Service

@Service
class BookService (
    val bookRepository: BookRepository
        ){

    fun create(book: BookModel) {
        bookRepository.save(book)
    }

}
