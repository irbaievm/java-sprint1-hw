import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {



    public static void main(String[] args) {
        FileLoader file1 = new FileLoader();
        String fileData =  file1.readFileContentsOrNull("/Users/irbaiev/dev/java-sprint1-hw/resources/m.202101.csv");
        System.out.println(fileData);

        }
    }





