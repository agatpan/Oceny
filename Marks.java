
import java.util.Arrays;

public class Marks {
    public static void main(String[] args){

        Pupil pupil_1 = new Pupil("Agata", "Pan", Arrays.asList(3, 4, 2, 2));

        System.out.println(pupil_1.getFirstName()+" "+ pupil_1.getSecondName()+ " " + pupil_1.getAllMarks());
        System.out.println(pupil_1.toString());
        System.out.println("średnia ocen : " + pupil_1.averageMark());
        System.out.println("najlepsza ocena : " + pupil_1.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil_1.findTheWorstMark());

        Pupil pupil_2 = new Pupil("Karol", "Iksinski", Arrays.asList(4, 5, 3, 5, 5));

        System.out.println(pupil_2.toString());
        System.out.println("średnia ocen : " + pupil_2.averageMark());
        System.out.println("najlepsza ocena : " + pupil_2.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil_2.findTheWorstMark());

        Pupil pupil_3 = new Pupil("Monika", "Kowalska", Arrays.asList(5, 5, 2, 3));
        System.out.println(pupil_3.toString());
        System.out.println("średnia ocen : " + pupil_3.averageMark());
        System.out.println("najlepsza ocena : " + pupil_3.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil_3.findTheWorstMark());

        Pupil pupil_4 = new Pupil("Ania", "Zielona", Arrays.asList(2, 5, 2, 3, 4));
        System.out.println(pupil_4.toString());
        System.out.println("średnia ocen : " + pupil_4.averageMark());
        System.out.println("najlepsza ocena : " + pupil_4.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil_4.findTheWorstMark());

        Pupil pupil_5 = new Pupil("Zawisza", "Czarny", Arrays.asList(2, 2, 2, 3, 4));
        System.out.println(pupil_5.toString());
        System.out.println("średnia ocen : " + pupil_5.averageMark());
        System.out.println("najlepsza ocena : " + pupil_5.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil_5.findTheWorstMark());
    }
}
