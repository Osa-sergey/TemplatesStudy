package ru.serov.creational.factorymethod

class LinuxCreator: IOsInfoCreator {
    override fun getSystem() = LinuxSystem()
}