package ru.serov.structural.bridge

fun main() {
    val terminal = Terminal(MacOS())
    terminal.printText("Hello, World!!!")
    terminal.printSystemInfo()
    terminal.setSystem(VersionedMacOS("1.1.0"))
    terminal.printSystemInfo()
}