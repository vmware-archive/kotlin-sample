package io.pivotal.pal.kotlinsample


fun main(args: Array<String>) {
    val registrar = Registrar()
    val cohort = registrar.createCohort(1)

    present("Cohort") {
        println(cohort)
    }

    present("Graduation Dates") {
        registrar
            .graduationDates(cohort)
            .forEach { println(it) }
    }

    present("Graduation Months") {
        cohort
            .students
            .map { graduationMonth(it) }
            .forEach { println(it) }
    }
}

private fun present(title: String, action: () -> Unit) {
    val bars = "-".repeat(25 - title.length / 2)

    println("$bars $title $bars".substring(0, 52))

    action()

    println()
}