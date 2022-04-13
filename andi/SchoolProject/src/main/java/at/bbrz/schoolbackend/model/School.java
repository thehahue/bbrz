package at.bbrz.schoolbackend.model;

import lombok.Data;

import java.util.List;

@Data
public class School {
    private int id;
    private List<Room> rooms;
    private  List<Class> classes;
    private Teacher director;
    private List<Teacher> teachers;
}
