import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class FileReader {

    public String readFile() throws IOException {


        String filePath = "C:/Users/Agata/Documents/Kurs QA/Marks/src/main/java/Oceny.txt";
        File file = new File(filePath);

        List<String> lines = Files.readAllLines(file.toPath());

        for (String line : lines) {
            System.out.println(line);

        }
        String[] parts = filePath.split(";", 3);
        String firstName = parts[0];
        String secondName = parts[1];
        String allMarks = parts[2].trim();
       // int allMarks = Integer.parseInt(s);

        String[] parts1 = allMarks.split(",");{
            for (String mark : allMarks.split(",")){
                   String allMarks1 =  mark;
            }
        }


           /* public String getFirstName() {
                return firstName;
            }

            public String getSecondName() {
                return secondName;
            }

            public int getAllMarks(){
                return String.valueOf(allMarks);
            }


            public String toString() {

                return "Imię : " + firstName + ", Nazwisko : " + secondName + ", Oceny : " + allMarks;
            }

            /*public double averageMark() {
                double averageMark;
                double suma = 0;

                for (Integer mark : allMarks) {
                    suma += mark;
                }

                averageMark = suma / allMarks.size();

                return averageMark;


            }
            public int findTheBestMark() {
                Integer theBestMark;
                theBestMark = Collections.max(allMarks);
                return theBestMark;
            }

            public int findTheWorstMark(){
                return Collections.min(allMarks);


            }*/

        //System.out.println(line);*/




}



