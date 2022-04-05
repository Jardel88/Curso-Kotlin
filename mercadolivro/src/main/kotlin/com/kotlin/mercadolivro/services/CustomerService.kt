package com.kotlin.mercadolivro.services

import com.kotlin.mercadolivro.controllers.request.PostCustomerRequest
import com.kotlin.mercadolivro.controllers.request.PutCustomerRequest
import com.kotlin.mercadolivro.model.CustomerModel
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.*

@Service
class CustomerService {

    val customers = mutableListOf<CustomerModel>()

    fun getAll(name: String?): List<CustomerModel>{
        name?.let {
            return customers.filter { it.name.contains(name, true) }
        }
        return customers
    }
    fun create(customer: PostCustomerRequest){

        var id = if (customers.isEmpty()){
            1
        } else {
            customers.last().id.toInt() + 1
        }.toString()

        customers.add(CustomerModel(id, customer.name, customer.email))
    }
    fun getCustomer(id: String): CustomerModel {
        return customers.filter { it.id == id }.first()
    }

    fun update(id: String, customer: PutCustomerRequest){
        customers.filter { it.id == id }.first().let {
            it.name = customer.name
            it.email = customer.email
        }
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: String){
        customers.removeIf { it.id == id }
    }
}