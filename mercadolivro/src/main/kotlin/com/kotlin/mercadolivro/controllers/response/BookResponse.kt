package com.kotlin.mercadolivro.controllers.response

import com.kotlin.mercadolivro.enums.BookStatus
import com.kotlin.mercadolivro.model.CustomerModel
import java.math.BigDecimal

data class BookResponse(

    var id: Int? = null,
    var name: String,
    var price: BigDecimal,
    var customer: CustomerModel? = null,
    var status: BookStatus? = null
)
