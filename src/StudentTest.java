import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {

//    ArrayList<Integer> exabiierGrade = new ArrayList<>();

    Student mason = new Student("Mason");
//    mason.setName("Mason");
    mason.addGrade(4);
    mason.addGrade(30);
    mason.addGrade(87);
        System.out.println(mason.getGradeAverage());


//    Student exabiier = new Student("Exabieer", exabiierGrade, 98, 99, 100);
//    exabiier.setName("Exabiier");

    Student exabieer = new Student("Exabiier");
    exabieer.addGrade(95);
    exabieer.addGrade(90);
    exabieer.addGrade(92);
        System.out.println(exabieer.getGradeAverage());


    }
}
