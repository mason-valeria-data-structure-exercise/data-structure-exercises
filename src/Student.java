import java.util.ArrayList;
import java.util.List;

public class Student{
    // // ===================================== Variables/Properties ===================================================
    private String name;
    private ArrayList<Integer> grades;

    // ===================================== Constructors ==============================================================
    Student(){}

//    Student(String name){
//        this.name = name;
//    }
    Student (String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // ===================================== Important Methods =========================================================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

//    public void addGrade (int grade){
//        this.grades.addAll(new ArrayList<>(List.of(grade)));
//    }

    public void addGrade(int grade){
        this.grades.addAll(new ArrayList<>(List.of(grade)));
    }

    public double getGradeAverage (){
        int total = 0;
        for (int i = 0; i < grades.size(); i++){
            total += grades.get(i);
        }

        return (double) total / grades.size();
    }
}
