package ru.serov.creational.singleton

class HistoryList private constructor() {
    private var entries: ArrayList<String> = ArrayList()
    companion object{
        private val instance: HistoryList by lazy { HistoryList() }
        @JvmName("getInstance1")
        fun getInstance(): HistoryList = instance
    }

    fun addCommand(str: String) = entries.add(str)

    fun undoCommand() = entries.removeAt(entries.size -1)

    override fun toString(): String {
        return "HistoryList(entries=$entries)"
    }


}