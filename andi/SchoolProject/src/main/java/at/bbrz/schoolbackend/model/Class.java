package at.bbrz.schoolbackend.model;

import lombok.Data;

import java.util.List;

@Data
public class Class {
    private int id;
    private List<Pupils> pupils;
    private Teacher classBoard;
}
