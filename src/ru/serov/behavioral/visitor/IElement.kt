package ru.serov.behavioral.visitor

interface IElement {
    fun accept(v:IVisitor)
}