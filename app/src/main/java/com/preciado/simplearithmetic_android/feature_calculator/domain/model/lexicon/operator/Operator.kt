package com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.operator

import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.Lexicon
import com.preciado.simplearithmetic_android.feature_calculator.domain.use_case.OperatorType

open class Operator(
    string: String,
    function: (Object?) -> Object?,
    var operatorType: OperatorType
) : Lexicon(
    string,
    function
){
}