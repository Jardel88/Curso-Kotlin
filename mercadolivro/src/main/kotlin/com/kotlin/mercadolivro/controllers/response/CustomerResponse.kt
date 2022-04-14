package com.kotlin.mercadolivro.controllers.response

import com.kotlin.mercadolivro.enums.CustomerStatus

data class CustomerResponse(

    var id: Int? = null,
    var name: String,
    var email: String,
    var status: CustomerStatus
)
