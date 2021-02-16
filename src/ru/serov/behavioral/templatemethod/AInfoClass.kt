package ru.serov.behavioral.templatemethod

abstract class AInfoClass(val address: String, val dateOfCreation: String) {

    // так как все методы изначально закрыты для переопределения,
    // то закрывать его в Kotlin не нужно
    fun getInfo(): String{
        var res = "Основная информация о здании[" +
                "\n\taddress: $address\n\tdate of creation: $dateOfCreation\n]\n" +
                "Специальная информация[\n\t"

        res += getSpecificInformation()
        res+="\n]"
        return res
    }

    abstract fun getSpecificInformation(): String
}