package com.kotlin.mercadolivro.repositories

import com.kotlin.mercadolivro.model.PurchaseModel
import org.springframework.data.jpa.repository.JpaRepository

interface PurchaseRepository: JpaRepository<PurchaseModel, Int> {

}
