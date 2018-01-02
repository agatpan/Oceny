import java.util.ArrayList;
import java.util.List;

public class Pupil {

    private String firstName;
    private String secondName;
    private Integer mark;
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
        for (Integer mark : allMarks)
            suma += mark;

        averageMark = suma / allMarks.size();


        return averageMark;

    }
    }

