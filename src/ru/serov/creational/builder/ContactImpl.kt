package ru.serov.creational.builder

class ContactImpl(firstName : String, secondName : String, title : String, organization : String)
    : AContact(firstName, secondName, title, organization) {

    override fun toString(): String {
        return "Contact(firstName=$firstName," +
                " secondName=$secondName," +
                " title='$title'," +
                " organization=$organization\n"
    }
}