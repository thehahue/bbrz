package at.bbrz.SchoolProject;

import java.time.LocalDate;

public class Student implements Person{

    private long id;
    private String name;
    private String firstName;
    private LocalDate birthDay;
    private  String studentID;

    public Student(long id, String name, String firstName, LocalDate birthDay, String studentID) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.birthDay = birthDay;
        this.studentID = studentID;
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
        return this.birthDay;
    }

    public String getStudentID() {
        return this.studentID;
    }
}
