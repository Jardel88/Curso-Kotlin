package com.kotlin.mercadolivro.services

import com.kotlin.mercadolivro.enums.CustomerStatus
import com.kotlin.mercadolivro.enums.Errors
import com.kotlin.mercadolivro.exception.NotFoundException
import com.kotlin.mercadolivro.model.CustomerModel
import com.kotlin.mercadolivro.repositories.CustomerRepository
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseStatus

@Service
class CustomerService(
    val customerRepository: CustomerRepository,
    val bookService: BookService
) {

    fun getAll(): List<CustomerModel>{
        return customerRepository.findAll()
    }
    fun create(customer: CustomerModel){
       customerRepository.save(customer)
    }
    fun getById(id: Int): CustomerModel {
        return customerRepository.findById(id).orElseThrow{ NotFoundException(Errors.ML201.message.format(id), Errors.ML201.code)}
    }

    fun update(customer: CustomerModel){
        if (!customerRepository.existsById(customer.id!!)){
            throw Exception()
        }
        customerRepository.save(customer)
        }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Int){
//        if (!customerRepository.existsById(id)){
//            throw Exception()
//        }
        val customer = getById(id)
        bookService.deleteByCustomer(customer)
        customer.status = CustomerStatus.INATIVO

        customerRepository.save(customer)
    }

    fun emailAvailable(email: String): Boolean {
        return !customerRepository.existsByEmail(email)

    }
}