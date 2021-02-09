package ru.serov.behavioral.iterator

interface IIterator {
    fun hasNext(): Boolean
    fun next(): Any
}