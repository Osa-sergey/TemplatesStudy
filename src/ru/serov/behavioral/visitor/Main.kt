package ru.serov.behavioral.visitor

fun main() {
    val car = Car(BodyElement(), EngineElement())
    val bully = BullyVisitor()
    val mechanic = MechanicVisitor()
    car.body.accept(bully)
    car.body.accept(mechanic)
    car.engine.accept(bully)
}