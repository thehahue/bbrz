package at.bbrz.schoolbackend.model;


import java.util.Date;

public class Teacher implements Person {
    private int id;
    private String firstName;
    private String lastname;
    private Date birthday;

    public Teacher(int id, String firstName, String lastname, Date birthday) {
        this.id = id;
        this.firstName = firstName;
        this.lastname = lastname;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
