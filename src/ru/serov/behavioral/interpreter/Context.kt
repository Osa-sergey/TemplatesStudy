package ru.serov.behavioral.interpreter

class Context {

    fun evaluate(str: String): IExpression{
        var pos = str.length-1
        while (pos>0){
            if(str.elementAt(pos).isDigit()) pos--
            else{
                val left = evaluate(str.substring(0,pos))
                val right = NumberExpression(str.substring(pos+1).toInt())
                val operator = str.elementAt(pos)
                when(operator){
                    '-' -> return MinusExpression(left, right)
                    '+' -> return PlusExpression(left, right)
                }
            }
        }
        return NumberExpression(str.toInt())
    }
}