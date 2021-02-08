package ru.serov.behavioral.chainofresponsibility

fun main() {
    val loggerSMS = SMSLogger(Level.ERROR)
    val loggerFile = FileLogger(Level.DEBUG)

    // собираем цепочку
    loggerSMS.setNextLogger(loggerFile)


    // отображается в обоих логгерах, так как ERROR <= DEBUG в File logger
    loggerSMS.writeMessage("Все плохо, все сломалось",Level.ERROR)

    // отображается только в File logger, так как DEBUG > ERROR
    loggerSMS.writeMessage("Отлаживаем", Level.DEBUG)

    // не отображается, так как INFO > всех других элементов
    loggerSMS.writeMessage("Информация для опопвещения", Level.INFO)
}