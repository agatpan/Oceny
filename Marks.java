
import java.util.Arrays;

public class Marks {
    public static void main(String[] args){

        Pupil pupil1 = new Pupil("Agata", "Pan", Arrays.asList(3, 4, 2, 2));

        System.out.println(pupil1.getFirstName()+" "+ pupil1.getSecondName()+ " " + pupil1.getAllMarks());
        System.out.println(pupil1.toString());
        System.out.println("średnia ocen : " + pupil1.averageMark());
        System.out.println("najlepsza ocena : " + pupil1.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil1.findTheWorstMark());

        Pupil pupil2 = new Pupil("Karol", "Iksinski", Arrays.asList(4, 5, 3, 5, 5));

        System.out.println(pupil2.toString());
        System.out.println("średnia ocen : " + pupil2.averageMark());
        System.out.println("najlepsza ocena : " + pupil2.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil2.findTheWorstMark());

        Pupil pupil3 = new Pupil("Monika", "Kowalska", Arrays.asList(5, 5, 2, 3));
        System.out.println(pupil3.toString());
        System.out.println("średnia ocen : " + pupil3.averageMark());
        System.out.println("najlepsza ocena : " + pupil3.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil3.findTheWorstMark());

        Pupil pupil4 = new Pupil("Ania", "Zielona", Arrays.asList(2, 5, 2, 3, 4));
        System.out.println(pupil4.toString());
        System.out.println("średnia ocen : " + pupil4.averageMark());
        System.out.println("najlepsza ocena : " + pupil4.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil4.findTheWorstMark());

        Pupil pupil5 = new Pupil("Zawisza", "Czarny", Arrays.asList(2, 2, 2, 3, 4));
        System.out.println(pupil5.toString());
        System.out.println("średnia ocen : " + pupil5.averageMark());
        System.out.println("najlepsza ocena : " + pupil5.findTheBestMark());
        System.out.println("najgorsza ocena : " + pupil5.findTheWorstMark());
    }
}
