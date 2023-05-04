package com.preciado.simplearithmetic_android.feature_calculator.domain.model

import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.Lexicon
import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.unknown.Unknown

class Token(
    var index: Int,
    var token: Char,
    var lexicon: Lexicon = Unknown("?", )
) {

}