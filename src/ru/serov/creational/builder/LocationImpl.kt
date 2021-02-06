package ru.serov.creational.builder

class LocationImpl(location : String) : ALocation(location) {
    override fun toString(): String {
        return location
    }
}