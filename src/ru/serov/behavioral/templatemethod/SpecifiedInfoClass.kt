package ru.serov.behavioral.templatemethod


class SpecifiedInfoClass(address: String, dateOfCreation: String, private vararg val authors: Author):
        AInfoClass(address,dateOfCreation) {
    override fun getSpecificInformation(): String {
        var str = "Авторы: "
        for (author in authors){
            str += "\n\t\t $author"
        }
        return str
    }


}