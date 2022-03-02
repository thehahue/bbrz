package at.bbrz.file;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {
	   // String txt=FileToString.readToString("src/main/resources/Person");
        System.out.println("Das hat funktioniert!");
        try (Stream<String> lines = Files.lines(Paths.get(args[0]))) {
            System.out.println(lines.collect(Collectors.joining("\n")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
