package com.kotlin.mercadolivro.controllers.request

import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PutCustomerRequest(

    @field:NotEmpty(message = "O nome deve ser informado!")
    var name: String,

    @field:Email(message = "E-mail inválido!")
    @field:NotEmpty(message = "O e-mail deve ser informado!")
    var email: String
    )