package ru.serov.behavioral.visitor

interface IVisitor {
    fun visit(e: EngineElement)
    fun visit(e: BodyElement)
}