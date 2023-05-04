package com.preciado.simplearithmetic_android.feature_calculator.domain.model

import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.Lexicon
import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.literal.Literal
import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.operator.Operator
import com.preciado.simplearithmetic_android.feature_calculator.domain.use_case.OperatorType
import javax.inject.Inject


class Calculator @Inject constructor(


){
    private val lexicons = mutableMapOf<String, Lexicon>()
    private val tokens = mutableListOf<Token>()
    private var result: String = "0"


    init {

        //creates Literal DIGITS
        for (i in 0..9) {
            lexicons.put(
                i.toString(),
                Literal(string = i.toString(), function = { obj ->
                    var result = 0
                    result = i
                    return@Literal result as Object
                })
            )
        }

        lexicons.put(
            "+",
            Operator("+", { obj -> return@Operator null as Object }, OperatorType.ADDITION)
        )
    }






   private fun setTokens(string: String){
       string.forEachIndexed { index, c ->
           var token = Token(index, c)
       }
    }


    fun calculate(problem: String): String{
        for (c in problem){

        }
        return result

    }

}