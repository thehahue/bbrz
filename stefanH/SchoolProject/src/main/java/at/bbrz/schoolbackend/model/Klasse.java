package at.bbrz.schoolbackend.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Klasse {
    private String id;
    private List<Schueler> schueler;
    private Lehrer klassenvorstand;

    public Klasse(String id, Lehrer klassenvorstand) {
        this.id = id;
        this.schueler=new ArrayList<>();
        this.klassenvorstand=klassenvorstand;
    }
}
