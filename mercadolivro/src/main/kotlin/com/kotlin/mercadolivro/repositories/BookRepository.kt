package com.kotlin.mercadolivro.repositories

import com.kotlin.mercadolivro.model.BookModel
import com.kotlin.mercadolivro.model.CustomerModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<BookModel, Int>{

}