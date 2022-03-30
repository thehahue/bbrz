package at.bbrz.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@ToString
public class Schueler implements Person {
    private String id;
    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getVorname() {
        return vorname;
    }

    @Override
    public String getNachname() {
        return nachname;
    }

    @Override
    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }
}
