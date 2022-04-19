package com.kotlin.mercadolivro.controllers.mapper

import com.kotlin.mercadolivro.controllers.request.PostPurchaseRequest
import com.kotlin.mercadolivro.model.BookModel
import com.kotlin.mercadolivro.model.PurchaseModel
import com.kotlin.mercadolivro.services.BookService
import com.kotlin.mercadolivro.services.CustomerService
import org.springframework.stereotype.Component

@Component
class PurchaseMapper(
    private val bookService: BookService,
    private val customerService: CustomerService
) {

    fun toModel(request: PostPurchaseRequest): PurchaseModel{
        val customer = customerService.getById(request.customerId)
        val books = bookService.findAllByIds(request.bookId)

        return PurchaseModel(
            customer = customer,
            books = books as MutableList<BookModel>,
            price = books.sumOf { it.price }
        )
    }
}