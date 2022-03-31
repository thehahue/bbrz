package at.bbrz.schoolbackend.model;

import java.time.LocalDate;

public interface Person {
    String getId();

    String getFirstName();

    String getLastName();

    LocalDate getDateOfBirth();
}
