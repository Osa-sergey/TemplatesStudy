package ru.serov.behavioral.visitor

interface Visitor {
    fun visit(e: EngineElement)
    fun visit(e: BodyElement)
}