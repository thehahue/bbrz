package at.bbrz.schoolbackend.model;

import lombok.Data;

import java.util.Date;

@Data
public class Teacher implements Person {
    private int id;
    private String firstname;
    private String lastname;
    private Date birthday;
}
