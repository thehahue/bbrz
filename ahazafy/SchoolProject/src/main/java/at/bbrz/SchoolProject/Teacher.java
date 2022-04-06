package at.bbrz.SchoolProject;

import java.time.LocalDate;

public class Teacher implements Person {

    private long id;
    private String name;
    private String firstName;
    private LocalDate birthDate;

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
}
