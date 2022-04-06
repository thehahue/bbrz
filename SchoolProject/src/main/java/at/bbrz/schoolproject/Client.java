package at.bbrz.schoolproject;

public class Client {

    public static void main(String[] args) {

        Person hansi = new Student(1,"Hansi","Graf", "19.02.2001");
        Person hans = new Teacher(5, "Hans", "King", "19.06.1969", "English");

        System.out.println(hans.getLastname());
    }
}
