public class Gegenstand {
    private Lehrer lehrerName;
    private String bezeichnung;

    public Gegenstand(String bezeichnung, Lehrer lehrerName) {
        this.lehrerName = lehrerName;
        this.bezeichnung = bezeichnung;
    }
}
