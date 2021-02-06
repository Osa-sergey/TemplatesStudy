package ru.serov.creational.kit

class EngFactory: ICompanyFactory {
    override fun createCompanyInfo(): ICompanyInfo {
        return MailRuInfoEng()
    }

    override fun createCompanyProducts(): ICompanyProducts {
        return MailRuProductsEng()
    }
}