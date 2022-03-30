public abstract class Person {

    private String vorname;
    private String nachname;
    private int id;
    private String geburtsdatum;

    public Person(int id, String vorname, String nachname, String geburtsdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.id = id;
        this.geburtsdatum = geburtsdatum;
    }
}
