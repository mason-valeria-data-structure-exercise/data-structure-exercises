// Comment for push
import java.util.HashMap;
import util.Input;

import java.util.*;
import static java.util.Map.entry;

public class GradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
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




        // adding all of previous entries ^^^^^ into hashmap
        studentHashMap.putAll(intermediateStudentMap);

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");


        studentHashMap.forEach((key, student) ->{
            System.out.printf(" |%s| ", key);
        });
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        HashMap<String, String> usernames = new HashMap<>();
        String userChoice = "y";

        while (userChoice.equalsIgnoreCase("y") || userChoice.equalsIgnoreCase("yes")){
            System.out.println("\nWhat student would you like to see more information on?");
            //System.out.println(studentHashMap.keySet());
            String userInput = scanner.nextLine();
                Student selectedStudent = studentHashMap.get(userInput);
            boolean userInputYes = userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
            if (studentHashMap.containsKey(userInput)) {

                System.out.printf("Name: %s - GitHub username: %s%n Current Average: %.2f%n", selectedStudent.getName(), userInput, selectedStudent.getGradeAverage());
                System.out.printf("%s's Grades: ", selectedStudent.getName());
                System.out.println(selectedStudent.getGrades());
//                System.out.printf("Grade 1: %.2f%n Grade 2: %.2f%n Grade 3: %.2f%f%n", selectedStudent.getGrades());
//                System.out.printf("%s Grades: %.2f%n%.2f%n%.2f%n", selectedStudent.getName(), );

            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput);
            }
            System.out.println("Do you want to continue? (y/n)");
            userChoice = scanner1.nextLine();
            if (!userInputYes){
                System.out.println("Would you like to view the classroom grades? (y/n)");
                userInput = scanner.next();
                if (userInput.equals("y")){
                    List<Object> allGrades = Arrays.asList(mason.getGrades(), danny.getGrades(), aaron.getGrades(), david.getGrades());
                    List<Object> allNames = Arrays.asList(mason.getName(), danny.getName(), aaron.getName(), david.getName());
                    List<Double> allAvg = Arrays.asList(mason.getGradeAverage(), danny.getGradeAverage(), aaron.getGradeAverage(), david.getGradeAverage());

                    for (int i = 0; i < studentHashMap.size(); i++){
                        System.out.printf("%s's Grades: %s Average: %.2f%n", allNames.get(i), allGrades.get(i), allAvg.get(i));
                    }
                }
                System.out.println("\nWould you like to see the class average?");
                System.out.println();
//                if (userInputYes){
//                    // get average of every individual student
//                    // add them together
//                    // divide by the number of students
//
//                }



                //                System.out.println("Later Skater!");

            }
        }

    } // End Main
} // End GradesApp Class
