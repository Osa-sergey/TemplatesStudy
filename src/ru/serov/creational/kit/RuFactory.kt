package ru.serov.creational.kit

class RuFactory: ICompanyFactory{
    override fun createCompanyInfo(): ICompanyInfo {
        return MailRuInfoRu()
    }

    override fun createCompanyProducts(): ICompanyProducts {
        return MailRuProductsRu()
    }
}