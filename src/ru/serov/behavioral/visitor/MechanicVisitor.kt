package ru.serov.behavioral.visitor

class MechanicVisitor: IVisitor {
    override fun visit(e: EngineElement) {
        println("Проверил двигатель")
    }

    override fun visit(e: BodyElement) {
        println("Выправил корпус")
    }
}