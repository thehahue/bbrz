package at.bbrz.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@ToString
public class Lehrer implements Person{
    private String id;
    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;
    private String hauptgegenstand;
}
