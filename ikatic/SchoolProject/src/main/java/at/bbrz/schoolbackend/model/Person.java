package at.bbrz.schoolbackend.model;

import java.time.LocalDate;

public interface Person {
    public long getId();

    public String getFirstName();

    public String getLastName();

    public LocalDate getDateOfBirth();
}
