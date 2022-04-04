package com.kotlin.mercadolivro.controllers

import com.kotlin.mercadolivro.controllers.request.PostCustomerRequest
import com.kotlin.mercadolivro.model.CustomerModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("customer")
class CustomerController {

    @GetMapping
    fun getCustomer(): CustomerModel{
        return CustomerModel("1", "Maria", "maria@email.com")
    }
    @PostMapping
    fun create(@RequestBody customer: PostCustomerRequest){
        println(customer)
    }
}