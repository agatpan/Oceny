import java.util.ArrayList;

public class Pupil {

    public String firstName;
    public String secondName;
    public int mark;
    public List<mark> allMarksTab = new ArrayList<mark>();


    public Pupil (String firstName, String secondName, List<mark>){
        this.firstName = firstName;
        this.secondName = secondName;
        this.allMarksTab = createMarksTab();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int Array.getMarksTab() {
        return allMarksTab;
    }

    public int averageMark() {

    public int sumMarks(allMarksTab){
            int suma=0;
            int nr=0;
            while(nr <allMarksTab.length){
                suma = suma + allMarksTab[nr];
                nr ++;
            }

        }
        averageMark = sumMarks / allMarksTab.length;

    }

        return averageMark;


    }

