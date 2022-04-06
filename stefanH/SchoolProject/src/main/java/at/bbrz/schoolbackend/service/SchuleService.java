package at.bbrz.schoolbackend.service;

import at.bbrz.schoolbackend.model.Lehrer;
import at.bbrz.schoolbackend.model.Schule;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@Getter
public class SchuleService {
    private Schule schule;

    public SchuleService() {
        this.schule = new Schule(28221, new Lehrer("L01", "Franz", "Maier", LocalDate.of(1980,12,15),"D"));
        schule.getLehrer().add(new Lehrer("L01", "Franz", "Maier", LocalDate.of(1980,12,15),"D"));
        schule.getLehrer().add(new Lehrer("L02", "Hermine", "Tremmel", LocalDate.of(1955,11,11),"E"));
    }
}
