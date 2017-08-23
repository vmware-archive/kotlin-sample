package io.pivotal.pal.kotlinsample

import java.time.Month

fun List<Student>.filterNames(prefix: String)
    = filter { student -> student.name.startsWith(prefix) }

fun graduationMonth(student: Student) : String
    = student.graduationDate?.month?.stringValue() ?: "Has not graduated"

fun Student.withNewName(newName: String) = let {
    assert(newName != "")
    val capitalizedName = newName.capitalize()

    copy(name = capitalizedName)
}

fun Month.stringValue() =
    when (this) {
        Month.JANUARY -> "01 - January"
        Month.FEBRUARY -> "02 - February"
        Month.MARCH -> "03 - March"
        Month.APRIL -> "04 - April"
        Month.MAY -> "05 - May"
        Month.JUNE -> "06 - June"
        Month.JULY -> "07 - July"
        Month.AUGUST -> "08 - August"
        Month.SEPTEMBER -> "08 - September"
        Month.OCTOBER -> "10 - October"
        Month.NOVEMBER -> "11 - November"
        Month.DECEMBER -> "12 - December"
    }

fun printEmailIfStudent(obj: Any) {
    if (obj is Student) {
        println(obj.email)
    }
}
