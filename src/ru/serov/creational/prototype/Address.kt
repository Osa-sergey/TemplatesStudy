package ru.serov.creational.prototype

class Address(var address: String,var index: Int ): ICloneable {
    override fun copy(): Any = Address(address,index)
    override fun toString(): String {
        return "Address(address='$address'," +
                " index=$index)"
    }

}
