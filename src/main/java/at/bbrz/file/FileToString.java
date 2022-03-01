package at.bbrz.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileToString {
    public static String readToString(String path) {

        try (Stream<String> lines = Files.lines(Paths.get(path))) {
            return lines.collect(Collectors.joining("\n"));
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
