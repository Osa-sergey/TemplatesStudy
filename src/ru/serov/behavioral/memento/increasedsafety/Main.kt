package ru.serov.behavioral.memento.increasedsafety

fun main() {

    val account = Container(Account("Serg", 1000,"1420"))
    account.undo()
    account.saveState()
    (account.originator as Account).total = 20
    println(account.originator)
    account.undo()
    println(account.originator)
    account.originator.changePin("1234")
    println(account.originator)
    account.undo()
    println(account.originator)
}