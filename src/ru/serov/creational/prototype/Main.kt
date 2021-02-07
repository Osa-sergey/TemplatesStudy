package ru.serov.creational.prototype

fun main(){
    /** Мы должны учесть то, что при неполном копировании все копии ссылаются
     * на один и тот же экземпляр в памяти, что иногда просто недопустимо.
     *
     * Попробуем сделать полное копирование
     * Для этого есть вариант у каждого ассоциированного с классом элемента
     * реализовывать интерфейс Cloneable до момента, когда классы не будут
     * содержать только примитивы, либо нужно обеспечивать конструкторы со
     * всеми параметрами и возможность получить все переменные, что намного
     * хуже с точки зрения ООП
     */

    var humanOriginal = Human("Serg","Serov",20,
    Address("Moscow",1100002))
    print(humanOriginal)
    humanOriginal.address.index = 120004
    print(humanOriginal)
    var humanClone = humanOriginal.copy() as Human
    humanClone.address.address = "St. Petersburg"
    print(humanClone)
    print(humanOriginal)
}