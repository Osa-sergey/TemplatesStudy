package ru.serov.structural.bridge

open class MacOS: IOperationSystem {
    override fun outputText(s: String) {
        println("Операционная система MacOS печатает $s")
    }

    override fun getName() {
        println("MacOS")
    }
}