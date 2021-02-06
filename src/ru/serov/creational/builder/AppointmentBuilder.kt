package ru.serov.creational.builder

import java.util.*
import kotlin.collections.ArrayList

open class AppointmentBuilder() {

    protected lateinit var appointment: Appointment

    fun buildAppointment() {
        appointment  = Appointment()
    }

    fun buildDates(startDate: Date, endDate: Date) {
        var curentDate = Date()
        if(startDate.after(curentDate)){
            appointment.startDate = startDate
        }
        if(endDate.after(startDate)){
            appointment.endDate = endDate
        }
    }

    fun buildDescription(description: String) {
        appointment.description = description
    }

    fun buildAttendees(attendees: ArrayList<AContact>) {
        if(!attendees.isEmpty()){
            appointment.attendees = attendees
        }
    }

    fun buildLocation(location: ALocation) {
        appointment.location = location

    }

    fun build(): Appointment{
        return appointment
    }

}
