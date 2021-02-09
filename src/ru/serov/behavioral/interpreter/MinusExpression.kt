package ru.serov.behavioral.interpreter

class MinusExpression(private val left: IExpression, private val right: IExpression): IExpression {
    override fun interpret() = left.interpret() - right.interpret()
}