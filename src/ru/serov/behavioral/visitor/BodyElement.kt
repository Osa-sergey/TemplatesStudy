package ru.serov.behavioral.visitor

class BodyElement: Element {
    override fun accept(v: Visitor) {
        v.visit(this)
    }

}
