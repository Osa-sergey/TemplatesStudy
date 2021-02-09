package ru.serov.behavioral.interpreter

// терминальный класс
class NumberExpression(private val number: Int): IExpression {
    override fun interpret() = number
}