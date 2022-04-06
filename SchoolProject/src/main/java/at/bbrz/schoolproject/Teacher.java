package at.bbrz.schoolproject;

import java.time.LocalDate;

public class Teacher implements Person{

    private int id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String subject;

    public Teacher(int id, String firstname, String lastname, LocalDate dateOfBirth, String subject) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.subject = subject;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getSubject() {
        return subject;
    }
}
