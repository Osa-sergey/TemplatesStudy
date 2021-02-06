package ru.serov.creational.builder

import java.util.*
import kotlin.collections.ArrayList


class Appointment() {
    lateinit var startDate: Date
    lateinit var endDate: Date
    lateinit var description: String
    var attendees: ArrayList<AContact> = arrayListOf()
    set(value){
        if (value != null) field = value
    }
    lateinit var location: ALocation
    companion object{
        const val EOL_STRING: String = "/n"
    }

    fun addAttendee(attendee: AContact){
        if(!attendees.contains(attendee))
            attendees.add(attendee)
    }

    fun removeAttendee(attendee: AContact){
        attendees.remove(attendee)
    }

    override fun toString(): String {
        return "Appointment(startDate=$startDate,\n" +
                " endDate=$endDate,\n" +
                " description='$description',\n" +
                " attendees=${attendees}," +
                " location=$location)"
    }
}