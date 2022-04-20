package at.bbrz.SchoolProject;

import java.util.ArrayList;
import java.util.List;

public class Form {
    private List<Student> studentList = new ArrayList<>();

    private String id;
    private Teacher formTeacher;


    public Form(List<Student> studentList, String id, Teacher formTeacher) {
        this.studentList = studentList;
        this.id = id;
        this.formTeacher = formTeacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public String getId() {
        return id;
    }

    public Teacher getFormTeacher() {
        return formTeacher;
    }
}
