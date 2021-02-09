package ru.serov.behavioral.iterator

fun main() {
    /** ConcreteAggregate в данном случае является
     *  нашей коллекцией.
     */
    val concreteAggregate = ConcreteAggregate()
    val iterator = concreteAggregate.getIterator()
    // Видим всю мощь автоприведения типов 
    while (iterator.hasNext()) println(iterator.next())
}