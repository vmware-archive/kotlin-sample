package io.pivotal.pal.kotlinsample


data class Cohort(
    val id: Long,
    val students: List<Student>,
    val course: Course

) : List<Student> by students

enum class Course {
    CLOUDNATIVE_DEVELOPER,
    CLOUDNATIVE_ARCHITECT,
    REPLATFORMING,
    MODERNIZATION
}
