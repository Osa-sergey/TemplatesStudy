package ru.serov.creational.factorymethod

class WindowsCreator: IOsInfoCreator {
    override fun getSystem() = WindowsSystem()
}