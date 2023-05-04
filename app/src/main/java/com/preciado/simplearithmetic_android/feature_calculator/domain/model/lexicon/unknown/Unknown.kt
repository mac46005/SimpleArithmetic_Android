package com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.unknown

import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.Lexicon

class Unknown(string: String, function: (Object) -> Object?): Lexicon(string, function) {
    override fun executeFunction(obj: Object): Object? {
        throw UnknownTokenException("")
    }
}