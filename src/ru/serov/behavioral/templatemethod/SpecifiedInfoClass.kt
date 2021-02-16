package ru.serov.behavioral.templatemethod


class SpecifiedInfoClass(address: String, dateOfCreation: String, vararg val authors: Author): InfoClass(address,dateOfCreation) {
    override fun getSpecificInformation(): String {
        var str = "Авторы: "
        for (author in authors){
            str += "\n\t\t $author"
        }
        return str
    }

}