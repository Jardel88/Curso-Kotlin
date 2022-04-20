package com.kotlin.mercadolivro.repositories

import com.kotlin.mercadolivro.enums.BookStatus
import com.kotlin.mercadolivro.model.BookModel
import com.kotlin.mercadolivro.model.CustomerModel
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<BookModel, Int>{
     fun findByStatus(status: BookStatus, pageable: Pageable): Page<BookModel>
     fun findByCustomer(customer: CustomerModel): List<BookModel>
}