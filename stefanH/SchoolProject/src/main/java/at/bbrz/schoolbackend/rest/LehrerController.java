package at.bbrz.schoolbackend.rest;

import at.bbrz.schoolbackend.model.Lehrer;
import at.bbrz.schoolbackend.service.LehrerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LehrerController {
    @Autowired
    private LehrerService lehrerService;

    @GetMapping("/lehrerliste")
    public List<Lehrer> showLehrer() {
        return lehrerService.getLehrer();
    }
}
