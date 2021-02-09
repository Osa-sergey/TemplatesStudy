package ru.serov.behavioral.iterator

class ConcreteAggregate(): IAggregate {
    val tasks = listOf("Сын", "Дом", "Дерево")

    override fun getIterator() = Iterator()

    inner class Iterator(): IIterator {
        private var index: Int = 0

        override fun hasNext() = index < tasks.size

        override fun next() = tasks[index++]

    }
}