package com.kotlin.mercadolivro.validation

import com.kotlin.mercadolivro.services.CustomerService
import javax.validation.ConstraintValidator
import javax.validation.ConstraintValidatorContext

class EmailAvailableValidation(var customerService: CustomerService): ConstraintValidator<EmailAvailable, String> {

    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
        if(value.isNullOrEmpty()) {
            return false
        }
        return customerService.emailAvailable(value)
    }

}