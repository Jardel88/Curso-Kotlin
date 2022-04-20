package com.kotlin.mercadolivro.controllers.request


import com.kotlin.mercadolivro.validation.EmailAvailable
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PostCustomerRequest(

    @field:NotEmpty(message = "O nome deve ser informado!")
    var name: String,

    @field:Email(message = "E-mail inválido!")
    @EmailAvailable
    var email: String
    )