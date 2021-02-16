package ru.serov.behavioral.visitor

interface Element {
    fun accept(v:Visitor)
}