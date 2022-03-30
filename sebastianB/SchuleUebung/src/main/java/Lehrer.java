public class Lehrer extends Person {

    private Gegenstand gegenstand;

    public Lehrer(int id, String vorname, String nachname, Gegenstand gegenstand ,String geburtsdatum) {
        super( id, vorname, nachname, geburtsdatum);
        this.gegenstand = gegenstand;
    }
}
