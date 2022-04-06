package at.bbrz.schoolbackend.model;

import java.time.LocalDate;

public interface Person {
    String getId();

    String getVorname();

    String getNachname();

    LocalDate getGeburtsdatum();
}