package main.java.at.bbrz.schoolbackend.model;


import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@Data
@ToString
@RequiredArgsConstructor
public class School {
    String name;
    Gym gym;
    Director director;
    List<Teacher> teachers;
    List<Room> rooms;
    List<SchoolClass> schoolClasses;

    public School addTeacher(Teacher... teacherList) {
        Collections.addAll(teachers, teacherList);
        return this;
    }

    public School addRoom(Room room) {
        rooms.add(room);
        return this;
    }

    public School addClass(SchoolClass ... schoolClassList) {
        Collections.addAll(schoolClasses, schoolClassList);
        return this;
    }

}
