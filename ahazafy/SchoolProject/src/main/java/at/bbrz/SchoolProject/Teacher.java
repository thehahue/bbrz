package at.bbrz.SchoolProject;

import java.time.LocalDate;

public class Teacher implements Person {

    private long id;
    private String subject;
    private String name;
    private String firstName;
    private LocalDate birthDate;

    public Teacher(long id, String subject, String name, String firstName, LocalDate birthDate) {
        this.id = id;
        this.subject = subject;
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public String getSubject() {
        return this.subject;
    }

}
