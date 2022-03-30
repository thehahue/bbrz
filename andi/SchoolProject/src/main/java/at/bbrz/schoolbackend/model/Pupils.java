package at.bbrz.schoolbackend.model;

import lombok.Data;

import java.util.Date;

@Data
public class Pupils implements Person{
    private int id;
    private String firstNama;
    private String lastName;
    private Date birthday;

}
