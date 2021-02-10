package ru.serov.behavioral.memento.increasedsafety

open class Account( var name: String,
 var total: Int, private var pin: String): IOriginator, ICloneable {

    private lateinit var container: Container

    fun changePin(newPin: String){
        container.saveState()
        pin = newPin
    }
    // мы должны создать полную копию без ссылок
    // для этого нам нужно организовать шаблон prototype
    override fun clone() = Account(name,total,pin)

    override fun toString(): String {
        return "Account(name='$name', total=$total, pin='$pin')"
    }

    // не используется напрямую
    override fun getMemento() = AccountMemento(this,clone())

    // не используется напрямую
    override fun setState(snapshot: IOriginator) {
        name = (snapshot as Account).name
        total = snapshot.total
        pin = snapshot.pin
    }

    // не используется напрямую
    override fun setContainer(container: Container) {
        this.container = container
    }
}