package at.bbrz.SchoolProject;

import java.time.LocalDate;

public class Teacher implements Person {

    private long id;
    private String studentId;
    private String name;
    private String firstName;
    private LocalDate birthDate;

    public Teacher(long id, String studentId, String name, String firstName, LocalDate birthDate) {
        this.id = id;
        this.studentId = studentId;
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
    public String getStudentId() {
        return studentId;
    }

}
