package at.bbrz.schoolproject;

import java.util.List;

public class ClassRoom extends Room{

    private int id;
    private List<Student>students;
    private Teacher classTeacher;

    public ClassRoom(int id, List<Student> students, Teacher classTeacher) {
        this.id = id;
        this.students = students;
        this.classTeacher = classTeacher;
    }

    public int getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Teacher getClassTeacher() {
        return classTeacher;
    }
}
