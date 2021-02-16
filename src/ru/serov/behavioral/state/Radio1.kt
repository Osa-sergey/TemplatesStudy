package ru.serov.behavioral.state

class Radio1: IStation {
    override fun play() {
        println("Вещает первая станция")
    }
}