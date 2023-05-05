package com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon

open abstract class Lexicon(
    var string: String,
    var function: (Object?) -> Object? = {obj -> null}
){
    open fun executeFunction(obj: Object? = null): Object?{
        return function(obj)
    }
}