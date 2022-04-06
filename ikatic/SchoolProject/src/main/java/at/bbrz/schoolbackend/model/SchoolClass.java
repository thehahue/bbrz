package at.bbrz.schoolbackend.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class SchoolClass {
    private long id;
    private List<Student> students;
    private Teacher headOfSchoolClass;

    public SchoolClass(long id, Teacher headOfSchoolClass) {
        this.id = id;
        this.students = new ArrayList<>();
        this.headOfSchoolClass = headOfSchoolClass;
    }
}
