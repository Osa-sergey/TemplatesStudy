package ru.serov.creational.builder

import java.util.*
import kotlin.collections.ArrayList

class Scheduler() {

    fun createAppointment(builder: AppointmentBuilder,
                                 startDate: Date,
                                 endDate: Date,
                                 description: String,
                                 location : ALocation,
                                 attendees: ArrayList<AContact>): Appointment{
        builder.buildAppointment()
        builder.buildDates(startDate, endDate)
        builder.buildDescription(description)
        builder.buildAttendees(attendees)
        builder.buildLocation(location)
        return builder.build()
    }
}