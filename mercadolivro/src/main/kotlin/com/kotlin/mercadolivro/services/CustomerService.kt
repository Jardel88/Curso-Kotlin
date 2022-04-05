package com.kotlin.mercadolivro.services

import com.kotlin.mercadolivro.model.CustomerModel
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus

@Service
class CustomerService {

    val customers = mutableListOf<CustomerModel>()

    fun getAll(name: String?): List<CustomerModel>{
        name?.let {
            return customers.filter { it.name.contains(name, true) }
        }
        return customers
    }
    fun create(customer: CustomerModel){

        var id = if (customers.isEmpty()){
            1
        } else {
            customers.last().id!!.toInt() + 1
        }.toString()
        customer.id = id
        customers.add(customer)
    }
    fun getCustomer(id: String): CustomerModel {
        return customers.filter { it.id == id }.first()
    }

    fun update(customer: CustomerModel){
        customers.filter { it.id == customer.id }.first().let {
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