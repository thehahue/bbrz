package main.java.at.bbrz.schoolbackend.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import java.util.Collections;
import java.util.List;

@Data
@ToString
@RequiredArgsConstructor
public class SchoolClass {
    private int id;
    private String name;
    private List<Student> students;
    private Teacher classTeacher;

    public void add(Student ... studentList) {
        Collections.addAll(students, studentList);
    }



}
