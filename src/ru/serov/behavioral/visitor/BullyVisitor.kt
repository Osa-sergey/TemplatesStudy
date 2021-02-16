package ru.serov.behavioral.visitor

class BullyVisitor: IVisitor {
    override fun visit(e: EngineElement) {
        println("Сломал двигатель")
    }

    override fun visit(e: BodyElement) {
        println("Побил молотком по корпусу")
    }
}