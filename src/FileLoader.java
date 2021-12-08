import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileLoader {
String FileName;


    public String readFileContentsOrNull(String path) {
        FileName = path;
        try {
            String a = Files.readString(Path.of(path));
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл с месячным отчётом. Возможно, файл не находится в нужной директории.");
            return null;
        }
    }

}
