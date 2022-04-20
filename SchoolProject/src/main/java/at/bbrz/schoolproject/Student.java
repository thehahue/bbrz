package at.bbrz.schoolproject;

import java.time.LocalDate;

public class Student implements Person {

    private int id;
    private String firstname;
    private String lastname;
    private String dateOfBirth;

    public Student(int id, String firstname, String lastname, String dateOfBirth) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
