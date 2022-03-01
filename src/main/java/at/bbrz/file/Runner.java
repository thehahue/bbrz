package at.bbrz.file;

public class Runner {

    public static void main(String[] args) {
	    String txt=FileToString.readToString("src/main/resources/Person");
        System.out.println(txt);
    }
}
