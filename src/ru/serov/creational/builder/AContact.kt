package ru.serov.creational.builder

import java.io.Serializable

/**
 * Вспомогательный класс, часть Appointment
 */
abstract class AContact(var firstName : String, var secondName : String,
                        var title : String, var organization : String) : Serializable {
    companion object{
        const val SPACE : String = " "
    }
}