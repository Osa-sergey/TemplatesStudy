package ru.serov.creational.kit

class MailRuProductsEng: ICompanyProducts {
    override fun getListOfProducts(): String {
        return "Warface," +
                " Crossfire," +
                " Armored Warfare," +
                " Skyforge, Allods Online," +
                " ArcheAge, Perfect World and Lost Ark," +
                " ICQ messenger, Yula mobile ad service," +
                " YouDrive car sharing, Citymobil online taxi ordering service, " +
                "and delivery platform food \"Delivery Club\""
    }
}