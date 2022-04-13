package at.bbrz.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@AllArgsConstructor
@Getter
public class Student implements Person {
    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

}
