package at.bbrz.schoolbackend.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
public class School {
    private long id;
    private List<SchoolClass> schoolClasses;
    private List<Room> rooms;
    private Teacher headmaster;
    private List<Teacher> teachers;

    public School(long id, Teacher headmaster) {
        this.id = id;
        this.schoolClasses = new ArrayList<>();
        this.rooms = new ArrayList<>();
        this.headmaster = headmaster;
        this.teachers = new ArrayList<>();
    }
}
