package main.java.at.bbrz.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@ToString
@AllArgsConstructor
@RequiredArgsConstructor
public abstract class Person {

    private int id;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;

}
