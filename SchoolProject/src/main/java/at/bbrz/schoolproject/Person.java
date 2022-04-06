package at.bbrz.schoolproject;

import java.time.LocalDate;

public interface Person {

    int getId();
    String getFirstname();
    String getLastname();
    LocalDate getDateOfBirth();

}
