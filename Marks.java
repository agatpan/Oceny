import java.awt.*;
import java.util.Arrays;

public class Marks {
    public static void main(String[] args){
        System.out.print("Hello World" + "\n");


        Pupil pupil = new Pupil("Agata", "Pan", Arrays.asList(3, 4, 2, 2));
        System.out.println(pupil.getFirstName()+" "+ pupil.getSecondName()+ " " + pupil.getAllMarks() + "\n");
        System.out.println(pupil.averageMark());


    }
}
