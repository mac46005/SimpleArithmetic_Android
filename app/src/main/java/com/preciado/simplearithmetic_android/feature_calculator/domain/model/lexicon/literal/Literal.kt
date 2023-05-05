package com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.literal

import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.Lexicon

class Literal (
    string: String,
    function: (Object?) -> Object? = {obj -> null}
        ) : Lexicon(
    string,
    function
        ){
}