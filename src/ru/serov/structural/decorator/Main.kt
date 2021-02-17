package ru.serov.structural.decorator

fun main() {
    val notification = Notification()
    val decorator = PhoneNotifierDecorator(
            EmailNotifierDecorator(notification))
    decorator.sendMessage("У нас пробоемы")
}