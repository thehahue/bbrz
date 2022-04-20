package at.bbrz.schoolbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolBackendApplication.class, args);
        Sheduler sheduler=new Sheduler();
        sheduler.machmal();
    }

}
