package at.bbrz.SchoolProject;

public class Room {
    private String id;
    private String name;

    public Room(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }

}
