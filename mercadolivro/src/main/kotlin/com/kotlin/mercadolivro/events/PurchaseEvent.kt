package com.kotlin.mercadolivro.events

import com.kotlin.mercadolivro.model.PurchaseModel
import org.springframework.context.ApplicationEvent

class PurchaseEvent(
    source: Any,
    val purchaseModel: PurchaseModel
): ApplicationEvent(source)