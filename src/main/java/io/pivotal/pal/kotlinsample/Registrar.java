package io.pivotal.pal.kotlinsample;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static io.pivotal.pal.kotlinsample.Course.REPLATFORMING;

public class Registrar {
    public Cohort createCohort(Long id) {
        List<Student> students = Arrays.asList(
            new Student(1, "Fred Derf", "fred@example.com", null),
            new Student(2, "Kate Etak", "kate@example.com", LocalDate.of(2016, 2, 21)),
            new Student(3, "Pete Etep", "pete@example.com", LocalDate.of(2016, 7, 21)),
            new Student(4, "Mona Anom", "mona@example.com", LocalDate.of(2016, 11, 21)),
            new Student(4, "Kris Sirk", "kris@example.com", null)
        );

        return new Cohort(id, students, REPLATFORMING);
    }

    public List<LocalDate> graduationDates(Cohort cohort) {
        return cohort.stream()
            .map((Student::getGraduationDate))
            .filter(Objects::nonNull)
            .collect(Collectors.toList());
    }
}
