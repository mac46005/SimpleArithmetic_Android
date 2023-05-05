package com.preciado.simplearithmetic_android.feature_calculator.domain.model.exceptions

import com.preciado.simplearithmetic_android.feature_calculator.domain.model.Token

class UnknownTokenException(var token: Token) : Exception() {
    override val message: String?
        get() = "Invalid token used: ${token.token} at position ${token.index}"
}