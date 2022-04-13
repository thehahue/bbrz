package at.bbrz.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@AllArgsConstructor
public class School {
    private String id;
    private List<SchoolClass> schoolClasses = new ArrayList<>();
    private List<Classroom> classrooms = new ArrayList<>();
    private Teacher headmaster;
    private List<Teacher> teachers = new ArrayList<>();

}
