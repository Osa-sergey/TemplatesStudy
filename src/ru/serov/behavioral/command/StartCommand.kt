package ru.serov.behavioral.command

class StartCommand(private val computer: Computer): ICommand {
    override fun execute() = computer.star()
}