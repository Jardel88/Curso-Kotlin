package com.kotlin.mercadolivro.services

import com.kotlin.mercadolivro.events.PurchaseEvent
import com.kotlin.mercadolivro.model.PurchaseModel
import com.kotlin.mercadolivro.repositories.PurchaseRepository
import org.springframework.context.ApplicationEventPublisher
import org.springframework.stereotype.Service

@Service
class PurchaseService(
    private val purchaseRepository: PurchaseRepository,
    private val applicationEventPublisher: ApplicationEventPublisher
) {

    fun create(purchaseModel: PurchaseModel){
        purchaseRepository.save(purchaseModel)

        applicationEventPublisher.publishEvent(PurchaseEvent(this, purchaseModel))
    }
}
