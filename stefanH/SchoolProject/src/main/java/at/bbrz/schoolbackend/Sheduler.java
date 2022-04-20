package at.bbrz.schoolbackend;

import lombok.extern.java.Log;
import org.springframework.scheduling.annotation.Scheduled;

@Log
public class Sheduler {

    @Scheduled(fixedDelay = 5)
    //@Scheduled(cron = "0 0 0/8 ? * * *")
    public void machmal() {
        log.info("Ausgabe");
    }
}
