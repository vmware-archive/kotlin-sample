package io.pivotal.pal.kotlinsample

import java.time.LocalDate


data class Student(
    val id: Long,
    val name: String,
    var email: String,
    val graduationDate: LocalDate?
)
