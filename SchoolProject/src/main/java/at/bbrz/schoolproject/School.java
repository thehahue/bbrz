package at.bbrz.schoolproject;

import java.util.List;

public class School {

    private int id;
    private List<Room>rooms;
    private List<ClassRoom>classRooms;
    private List<Teacher>teachers;
    private Teacher director;

    public School(int id, List<Room> rooms, List<ClassRoom> classRooms,
                        List<Teacher> teachers, Teacher director) {
        this.id = id;
        this.rooms = rooms;
        this.classRooms = classRooms;
        this.teachers = teachers;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public Teacher getDirector() {
        return director;
    }
}
