package ru.serov.behavioral.visitor

class EngineElement: Element {
    override fun accept(v: Visitor) {
        v.visit(this)
    }

}
