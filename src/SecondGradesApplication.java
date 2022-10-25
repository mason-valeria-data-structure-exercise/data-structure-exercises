import java.util.HashMap;
import util.Input;

import java.util.*;
import static java.util.Map.entry;

public class SecondGradesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        Scanner scanner = new Scanner(System.in);

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

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");


        studentHashMap.forEach((key, student) ->{
            System.out.printf(" |%s| ", key);
        });

        HashMap<String, String> usernames = new HashMap<>();
        boolean loopLogic = true;
        while (loopLogic){
            System.out.println("\nWhat student would you like to see more information on?");
            // store userInput as a variable
            String userInput = scanner.nextLine();
            // if userInput has the hashKey value
            if (studentHashMap.containsKey(userInput)) {
                Student selectedStudent = studentHashMap.get(userInput);
                // Print name, user's input (GitHub username), and the selected user's grade Average
                System.out.printf("Name: %s - GitHub username: %s%n Current Average: %.2f%n", selectedStudent.getName(), userInput, selectedStudent.getGradeAverage());
                // name's Grades: <Grade>
                System.out.printf("%s's Grades: ", selectedStudent.getName());
                System.out.println(selectedStudent.getGrades());
            } else {
                System.out.println("Sorry, no student found with the GitHub username of " + userInput);
            }
            System.out.println("Do you want to continue? (y/n)");
            userInput = scanner.nextLine();
            if (userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no")){
                System.out.println("Would you like to view the classroom grades? (y/n)");
                userInput = scanner.next();
                if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
                    List<Object> allGrades = Arrays.asList(mason.getGrades(), danny.getGrades(), aaron.getGrades(), david.getGrades());
                    List<Object> allNames = Arrays.asList(mason.getName(), danny.getName(), aaron.getName(), david.getName());
                    for (int i = 0; i < studentHashMap.size(); i++){
                        System.out.printf("%s's Grades: %s%n", allNames.get(i), allGrades.get(i));
                    }
                }
                System.out.println("Would you like to see the class average?");
                System.out.println();


            } // end If
        }
    }

}
