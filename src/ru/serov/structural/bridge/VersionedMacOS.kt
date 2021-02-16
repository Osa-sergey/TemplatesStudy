package ru.serov.structural.bridge

class VersionedMacOS(private val version: String): MacOS() {
    override fun getName() {
        println("MacOS v.$version")
    }
}