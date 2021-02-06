package ru.serov.creational.kit

fun main(){
    /** Мы можем расширить набор компаний путем добавления
     *  еще одной переменной, отвечающей за название компании.
     *
     *  Поддержка новых языков обеспечивается созданием еще одного элемента
     *  в Lang и классов MailRuInfo_ и MailRuProducts_
      */

    val factory = getCompanyFactoryByPref(Lang.ENG)
    print(factory.createCompanyProducts().getListOfProducts())
}

fun getCompanyFactoryByPref(lang:Lang):ICompanyFactory{
    return when (lang) {
        Lang.RU -> RuFactory()
        Lang.ENG -> EngFactory()
    }
}