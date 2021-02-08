package ru.serov.behavioral.command

class User(private val start:ICommand, private val stop:ICommand, private val reset:ICommand) {
    fun startComputer() = start.execute()
    fun stopComputer() = stop.execute()
    fun resetComputer() = reset.execute()
}