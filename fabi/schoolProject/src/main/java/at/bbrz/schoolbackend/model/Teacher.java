package main.java.at.bbrz.schoolbackend.model;

import java.util.Collections;
import java.util.List;


public class Teacher extends Person {
   private List<Subject> subjects;




   public Teacher add(Subject... subjectList){
      Collections.addAll(subjects, subjectList);
      return this;
   }
}


