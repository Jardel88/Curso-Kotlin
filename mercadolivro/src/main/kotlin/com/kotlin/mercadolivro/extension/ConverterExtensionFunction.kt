package com.kotlin.mercadolivro.extension

import com.kotlin.mercadolivro.controllers.request.PostCustomerRequest
import com.kotlin.mercadolivro.controllers.request.PutCustomerRequest
import com.kotlin.mercadolivro.model.CustomerModel

fun PostCustomerRequest.toCustomerModel(): CustomerModel {
    return CustomerModel(name = this.name, email = this.email)
}
fun PutCustomerRequest.toCustomerModel(id: String): CustomerModel {
    return CustomerModel(id = id, name = this.name, email = this.email)
}