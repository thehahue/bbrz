package main.java.at.bbrz.schoolbackend.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class Subject {
    int id;
    String name;



    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
