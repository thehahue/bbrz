import java.util.ArrayList;
import java.util.List;

public class Schule {
    private List<Klasse> klasse;
    private Direktor direktor;

    public Schule(Direktor direktor) {
        this.klasse = new ArrayList<>();
        this.direktor = direktor;
    }
}
