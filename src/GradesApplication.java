import java.util.HashMap;


import java.util.*;
import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        Student mason = new Student("Mason");
            mason.addGrade(90);
            mason.addGrade(85);
            mason.addGrade(88);
//        System.out.println(mason.getGradeAverage());
        Student david = new Student("David");
            david.addGrade(92);
            david.addGrade(80);
            david.addGrade(88);
//        System.out.println(david.getGradeAverage());
        Student aaron = new Student("Aaron");
            aaron.addGrade(87);
            aaron.addGrade(86);
            aaron.addGrade(90);
//        System.out.println(aaron.getGradeAverage());
        Student danny = new Student("Danny");
            danny.addGrade(85);
            danny.addGrade(89);
            danny.addGrade(99);
//        System.out.println(danny.getGradeAverage());


        HashMap<String, Student> studentHashMap = new HashMap<>();
        Map<String, Student> intermediateStudentMap = Map.ofEntries(
                entry("WoodyMas", mason),
                entry("Lara5595", david),
                entry("Aarmorris", aaron),
                entry("dannySan", danny)
        );

        studentHashMap.putAll(intermediateStudentMap);
//        for (Map.Entry<String, Student>studentEntry : studentHashMap.entrySet()){
//            Student studentInfo = studentEntry.getValue();
//            System.out.printf("%n%s has the following grades: %.2f%n", studentInfo, studentInfo.getGradeAverage());
//        }

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
//        System.out.printf("|%s| |%s| |%s| |%s|", studentHashMap.keySet());

        studentHashMap.forEach((key, student) ->{
            System.out.printf(" |%s| ", key);
        });
        Scanner scanner = new Scanner(System.in);



        System.out.println("\nWhat student would you like to see more information on?");
        System.out.println(studentHashMap.keySet());
        String userInput = scanner.next();
        Student[] newStudentArray = studentHashMap.values().toArray(new Student[0]);
        System.out.println(newStudentArray);
        for (Student student : newStudentArray){
            System.out.println("test " + student.getGradeAverage());
        }

        if (userInput.equals(studentHashMap.keySet())) {

//            System.out.printf("Name: %s - GitHub Username: %s%n Current Average: %.2f%n", studentHashMap.get(0), studentHashMap.keySet());
        }

//        studentHashMap.keySet();

    // Comment Test #1


    }
}
