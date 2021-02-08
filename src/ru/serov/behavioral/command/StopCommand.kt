package ru.serov.behavioral.command

class StopCommand(private val computer: Computer): ICommand {
    override fun execute() =computer.stop()
}