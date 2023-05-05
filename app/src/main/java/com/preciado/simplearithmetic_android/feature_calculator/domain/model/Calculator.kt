package com.preciado.simplearithmetic_android.feature_calculator.domain.model

import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.Lexicon
import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.literal.Literal
import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.operator.Operator
import com.preciado.simplearithmetic_android.feature_calculator.domain.model.lexicon.unknown.Unknown
import com.preciado.simplearithmetic_android.feature_calculator.domain.use_case.OperatorType
import javax.inject.Inject


class Calculator @Inject constructor(


){
    private var lexicons = mutableMapOf<String, Lexicon>()
    private var operators = mutableMapOf<String, Operator>()
    private var literals = mutableMapOf<String, Literal>()

    init{
        for(i in 0..9){
            literals.put(i.toString(), Literal(i.toString(), {obj-> return@Literal i.toString() as Object}))
        }


        operators.put(
            "+",
            Operator(
                "+",
                { obj ->
                    var literals: List<Literal> = obj as List<Literal>

                    var leftOperand = literals[0].executeFunction() as Int
                    var rightOperand = literals[1].executeFunction() as Int
                    var result = leftOperand + rightOperand

                    return@Operator result as Object
                },
                OperatorType.ADDITION
            )
        )

        lexicons = mutableMapOf()
        lexicons.putAll(literals)
        lexicons.putAll(operators)

    }


    fun calculate(problem: String): String{
        var tokens = processTokens(problem)

    }

    /**
     * Initializes Tokens by spliting the string given by ' ' and assigning Token.symbols to the given splits
     * @author Marco Preciado
     */
    private fun processTokens(string: String): List<Token>{
        var tokens = mutableListOf<Token>()
        var split = string.split(" ")
        split.forEachIndexed { index, s ->
            var token = Token(index, s, Unknown(s))
            tokens.add(token)
        }
        return tokens
    }

    /**
     *
     */
    private fun processLexicons(tokens: List<Token>) : List<Token>{
        var newTokens = mutableListOf<Token>()


        tokens.forEach { token ->
            var ts : List<Token> = processToken(token.symbols)
            newTokens.addAll(ts)

        }


        return newTokens
    }


    private fun isOperator(symbol: String): Boolean{
        if(operators.get(symbol) != null){
            return true
        }
        return false
    }
    private fun isLiteral(symbol: String): Boolean{
        if(literals.get(symbol) != null){
            return true
        }
        return false
    }
    private fun nextElementExists(currentPosition: Int, symbols: String): Boolean{
        if(symbols[currentPosition + 1] != null){
            return true
        }
        return false
    }


    private fun processToken(originalToken: String): MutableList<Token> {
        var newTokens = mutableListOf<Token>()

        var i = 0
        while(i < originalToken.length){
            var lexicon = lexicons.get(originalToken[i].toString())
            when(lexicon){
                is Literal -> {
                    var t : Token
                    t = processLiterals(originalToken, originalToken[i].toString(), i)

                }
                is Operator -> {

                }
            }
        }

        return newTokens
    }
    private fun processLiterals(tokenStr: String, character: String, index: Int,token: Token = Token(0, "?")) : Token{
        if(token.symbols != "?"){
            token.symbols = character
            token.index = index
        }else{
            token.symbols + character
        }

        if(nextElementExists(index, tokenStr)){
            if(isLiteral(tokenStr[index + 1].toString())){
                return processLiterals(tokenStr, tokenStr[index + 1].toString(), index + 1, token)
            }
        }else{
            token.lexicon = Literal(token.symbols, {obj ->
                return@Literal token.symbols as Object
            })
        }

        return token
    }


}