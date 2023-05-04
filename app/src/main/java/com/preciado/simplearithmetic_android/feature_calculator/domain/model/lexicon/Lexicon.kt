package com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon

open abstract class Lexicon(
    var string: String,
    var function: (Object) -> Object?
){
    open fun executeFunction(obj: Object): Object?{
        return function(obj)
    }
}