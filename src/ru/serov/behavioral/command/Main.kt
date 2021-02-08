package ru.serov.behavioral.command

fun main() {
    /** У нас есть Invoker - User, который посылает команды
     *  computer. В самих командах есть ссылка на объект computer и
     *  могут содержаться параметры для выполнения метода.
     *  Когда у команды вызывается метод execute, команда
     *  вызывает метод у объекта computer.
     *  С помощью набора команд мы можем сделать прослойку, которая
     *  позволит вызывать команду, а не дублировать куски кода
     */
    val computer = Computer()
    val user = User(StartCommand(computer),StopCommand(computer),ResetCommand(computer))

    user.startComputer()
    user.stopComputer()
    user.resetComputer()
}