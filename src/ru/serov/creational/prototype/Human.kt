package ru.serov.creational.prototype

class Human(val firstName: String, val secondName: String,
var age: Int,var address: Address): Cloneable {

    override fun copy(): Any {
        // Воспользуемся небезопасным приведением, так как элемент, который
        // мы возвращаем класса Any
        val newAddress = address.copy() as Address
        return Human(firstName,secondName,age,newAddress)
    }

    override fun toString(): String {
        return "Human(firstName='$firstName'," +
                " secondName='$secondName'," +
                " age=$age," +
                " address=$address)\n"
    }


}