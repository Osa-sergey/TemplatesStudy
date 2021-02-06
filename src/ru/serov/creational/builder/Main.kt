package ru.serov.creational.builder

import java.util.*

fun main() {
    /** Сейчас мы попробуем сложный вариант данного шаблона,
     *  однако можно ограничиться лишь одним вспомогательным классом в случае
     *  простых объектов
     */

    /** Scheduler является классом, отвечающим за последовательность сборки
     * компонентов Appointment. По идее мы можем хранить в нем экземпляры разных
     * Builder-ов и на их основе создавать нужный нам экземпляр или же
     * добавлять другие методы для того чтобы изменить набор заполняемых полей
     * в Appointment
     * 
     * AppointmentBuilder отвечает за ограничения и бизнес логику построения
     * Appointment. Мы можем от него отнаследоваться для того чтобы опреде
     * лить другой вид мероприятия со своим набором ограничений. Лучше конечно
     * для этого изначально использовать интерфейс
     */
    var scheduler = Scheduler()
    var startDate = Date(1633545502000)
    var endDate = Date(1633891102000)
    var description = "Hello, World!!! conf"
    var location = LocationImpl("StarExpo")
    var attendees = arrayListOf<AContact>(ContactImpl("Serg","Serov","member","NUST MISiS"),
                                            ContactImpl("Alex","Onin","speaker","NUST MISiS"))
    var appointment = scheduler.createAppointment(AppointmentBuilder(),
        startDate,endDate,description,location,attendees)
        print(appointment)
}