package ru.serov.behavioral.visitor

class BodyElement: IElement {
    override fun accept(v: IVisitor) {
        v.visit(this)
    }

}
