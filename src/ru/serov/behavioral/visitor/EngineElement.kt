package ru.serov.behavioral.visitor

class EngineElement: IElement {
    override fun accept(v: IVisitor) {
        v.visit(this)
    }

}
