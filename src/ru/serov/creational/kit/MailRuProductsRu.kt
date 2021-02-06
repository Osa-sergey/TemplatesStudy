package ru.serov.creational.kit

class MailRuProductsRu: ICompanyProducts {
    override fun getListOfProducts(): String {
        return " Warface, Crossfire, Armored Warfare, " +
                "Skyforge, Аллоды Онлайн, ArcheAge, Perfect World и Lost Ark," +
                " мессенджер «ICQ», мобильный сервис бесплатных объявлений «Юла»," +
                " каршеринг «YouDrive», сервис онлайн-заказа такси «Ситимобил»," +
                " и платформа для доставки еды «Delivery Club»"
    }
}