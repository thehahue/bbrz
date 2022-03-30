import java.util.ArrayList;
import java.util.List;

public class Klasse {

    private List<Person>personen;
    private String klassenname;

    public Klasse(String klassenname) {
        this.personen = new ArrayList<>();
        this.klassenname = klassenname;
    }
}
