package com.kotlin.mercadolivro.extension

import com.kotlin.mercadolivro.controllers.request.PostBookRequest
import com.kotlin.mercadolivro.controllers.request.PostCustomerRequest
import com.kotlin.mercadolivro.controllers.request.PutBookRequest
import com.kotlin.mercadolivro.controllers.request.PutCustomerRequest
import com.kotlin.mercadolivro.enums.BookStatus
import com.kotlin.mercadolivro.model.BookModel
import com.kotlin.mercadolivro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email)
}
fun PutCustomerRequest.toCustomerModel(id: Int): CustomerModel {
    return CustomerModel(id = id, name = this.name, email = this.email)
}
fun PostBookRequest.toBookModel(customer: CustomerModel): BookModel{
    return BookModel(
        name = this.name,
        price = this.price,
        status = BookStatus.ATIVO,
        customer = customer
    )
}
fun PutBookRequest.toBookModel(previousValue: BookModel): BookModel{
    return BookModel(
        id = previousValue.id,
        name = this.name ?: previousValue.name,
        price = this.price ?: previousValue.price,
        status = previousValue.status,
        customer = previousValue.customer
    )
}