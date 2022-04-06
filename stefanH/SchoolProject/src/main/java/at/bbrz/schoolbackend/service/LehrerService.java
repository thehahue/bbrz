package at.bbrz.schoolbackend.service;

import at.bbrz.schoolbackend.model.Lehrer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LehrerService {
    @Autowired
    private SchuleService schuleService;

    public List<Lehrer> getLehrer() {
        return schuleService.getSchule().getLehrer();
    }

    public void insertLehrer(Lehrer lehrer) {
        schuleService.getSchule().getLehrer().add(lehrer);
    }
}
