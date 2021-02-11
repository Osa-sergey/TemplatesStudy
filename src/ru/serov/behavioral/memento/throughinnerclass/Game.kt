package ru.serov.behavioral.memento.throughinnerclass

class Game(private var level: String = "1",
            var time: Int = 0) {

    fun save() = GameSave(level,time)

    // костыль из-за которого теряется сокрытие структуры
    // класса Game. Все из-за того, что в Kotlin внешние
    // классы не видят privat поля inner классов
    fun restore(gameSave: GameSave){
        level = gameSave.getLevel()
        time = gameSave.getTime()
    }

    override fun toString(): String {
        return "Game(level='$level', time=$time)"
    }

    inner class GameSave(private val level: String,
                         private val time: Int){
        fun getLevel() = level
        fun getTime() = time
    }

}
