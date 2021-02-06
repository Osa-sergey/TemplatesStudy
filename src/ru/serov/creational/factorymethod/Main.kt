package ru.serov.creational.factorymethod

fun main(){
    /** Данный шаблон очень похож на Kit, так как из нескольких таких
     *  шаблонов Kit и формируется. Основная задача шаблона выдать элемент типа
     *  IOsType, конкретный класс реализации которого определяется тикущей потребностью
     */

    var creator = getCreator(Type.WINDOWS)
    print(creator.getSystem().getSystemType())
}

fun getCreator(type: Type): IOsInfoCreator {
    return when(type)
    {
        Type.LINUX -> LinuxCreator()
        Type.WINDOWS -> WindowsCreator()
    }
}
