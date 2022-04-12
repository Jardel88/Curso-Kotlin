package com.kotlin.mercadolivro.services

import com.kotlin.mercadolivro.enums.BookStatus
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

    fun findAll(): List<BookModel> {
      return bookRepository.findAll().toList()
    }

    fun findActives(): List<BookModel> {
        return bookRepository.findByStatus(BookStatus.ATIVO)
    }

    fun findById(id: Int): BookModel {
        return bookRepository.findById(id).orElseThrow()
    }

    fun delete(id: Int) {
        val book = findById(id)
        book.status = BookStatus.CANCELADO
        bookRepository.save(book)
    }

    fun update(book: BookModel) {
        bookRepository.save(book)
    }

}
