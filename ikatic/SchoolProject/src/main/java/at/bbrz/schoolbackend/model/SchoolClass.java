package at.bbrz.schoolbackend.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class SchoolClass {
    private String id;
    private List<Student> students;
    private Teacher headOfSchoolClass;

    public SchoolClass(String id, Teacher headOfSchoolClass) {
        this.id = id;
        this.students = new ArrayList<>();
        this.headOfSchoolClass = headOfSchoolClass;
    }
}
