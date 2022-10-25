import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Student {
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

//    public int compare(Student m1, Student m2){
//        return Integer.compare(m2.getGrades(), m1.getGrades());
//    }

    public String toString(){
        return name;
    }

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



    protected double getClassAverage(HashMap<String, Student> classSize){
        int total = 0;
        for (int i = 0; i < classSize.size(); i++){
            total += classSize.get(i).getGradeAverage();

        }
        return (double) total / classSize.size();
    }

}
