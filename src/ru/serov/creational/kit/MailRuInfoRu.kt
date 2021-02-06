package ru.serov.creational.kit

class MailRuInfoRu: ICompanyInfo  {
    override fun getCompanyInfo(): String {
        return "российская технологическая корпорация. " +
                "Среди её активов социальные сети «ВКонтакте»" +
                " и «Одноклассники», портфолио онлайн-игр," +
                " куда входят такие проекты как Warface," +
                " Crossfire, Armored Warfare, Skyforge," +
                " Аллоды Онлайн, ArcheAge, Perfect World и Lost Ark," +
                " мессенджер «ICQ», " +
                "мобильный сервис бесплатных объявлений «Юла»," +
                " каршеринг «YouDrive»," +
                " сервис онлайн-заказа такси «Ситимобил»," +
                " и платформа для доставки еды «Delivery Club»."
    }

    override fun getCompanyName(): String {
        return "МаилРу"
    }
}