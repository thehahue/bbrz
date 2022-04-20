package at.bbrz.SchoolProject;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Room> rooms = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();
    private List<Form> forms =new ArrayList<>();

    private String id;
    private Teacher headMaster;


    public School(List<Room> rooms, List<Teacher> teachers, List<Form> forms, String id, Teacher headMaster) {
        this.rooms = rooms;
        this.teachers = teachers;
        this.forms = forms;
        this.id = id;
        this.headMaster = headMaster;
    }

    public Teacher getHeadMaster() {
        return headMaster;
    }

    public String getId() {
        return id;
    }

    public List<Form> getForms() {
        return forms;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
