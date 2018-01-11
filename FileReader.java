import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileReader {

    public  void readFile() throws IOException{


        String filePath = "C:/Users/Agata/Documents/Kurs QA/Marks/src/main/java/Oceny.txt";
        File file = new File(filePath);

        List<String> lines = Files.readAllLines(file.toPath());

        for (String line : lines) {
            System.out.println(line);
        }

    }
}



