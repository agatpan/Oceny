
import java.util.Collections;
import java.util.List;

public class Pupil {

    private String firstName;
    private String secondName;
    public List<Integer> allMarks;


    public Pupil (String firstName, String secondName, List<Integer> allMarks){
        this.firstName = firstName;
        this.secondName = secondName;
        this.allMarks = allMarks;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<Integer> getAllMarks(){
        return allMarks;
    }

    public float averageMark() {
        float averageMark;
        float suma = 0;
        /*for (Integer mark : allMarks)
            suma += mark;

        averageMark = suma / allMarks.size();

        return averageMark;*/

        Integer mark;
        for (mark = 0; mark < allMarks.size() ; mark++)

            suma += mark;
        averageMark = suma / allMarks.size();

        return averageMark;
        }
    public int findTheBestMark() {
        Integer theBestMark = Collections.max(allMarks);
        return theBestMark;
        }

    public int findTheWorstMark(){
        Integer theWorstMark = Collections.min(allMarks);
        return theWorstMark;
    }



    }






