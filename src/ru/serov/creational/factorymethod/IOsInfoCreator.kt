package ru.serov.creational.factorymethod

interface IOsInfoCreator {
    fun getSystem(): IOsType
}