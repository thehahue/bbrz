package at.bbrz.schoolbackend.model;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class Schule {
    private long id;
    private List<Klasse> klassen;
    private List<Raum> raeume;
    private Lehrer direktor;
    private List<Lehrer> lehrer;

    public Schule(long id, Lehrer direktor) {
        this.id = id;
        this.direktor = direktor;
        lehrer=new ArrayList<>();
        klassen=new ArrayList<>();
        raeume=new ArrayList<>();
    }

}
