package ru.serov.behavioral.command

class ResetCommand(private val computer: Computer): ICommand {
    override fun execute() = computer.reset()
}