package ru.serov.structural.bridge

class Terminal(private var system: IOperationSystem) {
    fun printText(s:String) = system.outputText(s)
    fun printSystemInfo() = system.getName()
    fun setSystem(system: IOperationSystem) {
        this.system = system
    }
}