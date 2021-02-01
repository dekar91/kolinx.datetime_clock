package ru.test.ru.test.utils

import kotlinx.datetime.*

open class ServerTime() {

    private var offset:Long = 0
        set(value) {
            field = value
            initialized = true
        }
    var initialized = false


    fun setOffset(date:String) {
        val currentDate: LocalDateTime = LocalDateTime.parse(date)

        val tmpCalendar = currentDate.toInstant(TimeZone.UTC)
        offset = Clock.System.now().toEpochMilliseconds() - tmpCalendar.toEpochMilliseconds()
        initialized = true
    }

    fun getServerDateString(): String {
        val currentCalendar = Clock.System.now();
        currentCalendar.minus(offset, DateTimeUnit.MILLISECOND, TimeZone.UTC)
        return currentCalendar.toString()
    }
}