package ru.serov.structural.composite

fun main() {
    // для простоты создадим дерево руками
    // лучше сделать это нормально и закрыть коллекцию потомков
    val composite = Receipt()
    val receipt1 = Receipt()
    val receipt2 = Receipt()
    receipt1.addComponent(Item(10))
    receipt1.addComponent(Item(120))
    receipt2.addComponent(Item(40))
    receipt2.addComponent(Item(19))
    composite.addComponent(receipt1)
    composite.addComponent(receipt2)
    println(composite.getCost())
}