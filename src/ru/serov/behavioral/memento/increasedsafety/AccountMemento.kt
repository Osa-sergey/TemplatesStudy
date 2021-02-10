package ru.serov.behavioral.memento.increasedsafety

// Уникальное имя класса нужно только для каста IOriginator в правильный подтип
class AccountMemento(originator: IOriginator, snapshot: IOriginator): Memento(originator,snapshot){}