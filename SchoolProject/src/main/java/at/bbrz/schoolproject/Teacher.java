package at.bbrz.schoolproject;

import java.time.LocalDate;

public class Teacher implements Person{

    private int id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;

    public Teacher(int id, String firstname, String lastname, LocalDate dateOfBirth) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public void getId() {

    }

    @Override
    public void getFirstName() {

    }

    @Override
    public void getLastName() {

    }

    @Override
    public void getDateOfBirth() {

    }
}
