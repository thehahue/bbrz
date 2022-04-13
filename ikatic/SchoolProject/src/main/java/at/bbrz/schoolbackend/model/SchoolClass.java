package at.bbrz.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
@AllArgsConstructor
public class SchoolClass {
    private String id;
    private List<Student> students = new ArrayList<>();
    private Teacher headOfSchoolClass;
}
