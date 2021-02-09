package ru.serov.behavioral.interpreter


fun main(){
    /** Будем разбирать простой пример с операциями сложения
     * и вычитания. Наша задача состоит в разборе входной строки на
     * операции и исполнение их.
     */

    val context = Context()
    val expression = context.evaluate("1+2-7")
    print(expression.interpret())
}