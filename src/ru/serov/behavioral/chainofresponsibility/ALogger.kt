package ru.serov.behavioral.chainofresponsibility

abstract class ALogger(protected val priority: Level): ILogger {

    protected var next: ILogger? = null

    fun setNextLogger(ILogger: ILogger) {
        next = ILogger
    }

    override fun writeMessage(message: String, level: Level) {
        if (level.ordinal<=priority.ordinal){
           createMessage(message)
        }
        next?.writeMessage(message,level)
    }

    abstract fun createMessage(str:String)
}