package at.bbrz.schoolproject;

import java.time.LocalDate;

public class Student implements Person {

    private int id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;


    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
