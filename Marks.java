
import java.util.Arrays;

public class Marks {
    public static void main(String[] args){

        Pupil pupil1 = new Pupil("Agata", "Pan", Arrays.asList(3, 4, 2, 2));
        System.out.println(pupil1.getFirstName()+" "+ pupil1.getSecondName()+ " " + pupil1.getAllMarks());
        System.out.println(pupil1.averageMark());
        System.out.println(pupil1.findTheBestMark());
        System.out.println(pupil1.findTheWorstMark());


    }
}
