package com.kotlin.mercadolivro.events.listener

import com.kotlin.mercadolivro.events.PurchaseEvent
import com.kotlin.mercadolivro.services.BookService
import com.kotlin.mercadolivro.services.PurchaseService
import org.springframework.context.event.EventListener
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component
import java.util.*

@Component
class UpdateSoldBookListener(
    private val bookService: BookService
) {
    @Async
    @EventListener
    fun listen(purchaseEvent: PurchaseEvent){
       bookService.purchase(purchaseEvent.purchaseModel.books)
    }
}