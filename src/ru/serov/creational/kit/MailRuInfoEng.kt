package ru.serov.creational.kit

class MailRuInfoEng: ICompanyInfo {
    override fun getCompanyInfo(): String {
        return "Russian technology corporation. " +
                "Among her social media resources are VKontakte " +
                "and Odnoklassniki, which includes projects such as Warface," +
                " Crossfire, Armored Warfare, Skyforge, Allods Online, " +
                "ArcheAge, Perfect World and Lost Ark, ICQ messenger," +
                " mobile service Buy Yula ads , YouDrive carsharing," +
                " Citymobil online taxi ordering service, and Delivery Club" +
                " food delivery platform."
    }

    override fun getCompanyName(): String {
       return "Mail.ru"
    }
}