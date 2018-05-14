package grades;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String studentName, ArrayList<Integer> grades) {
        this.studentName = studentName;
        this.grades = grades;
    }

    public void addStudent(){

    }

    public void addGrade(){

    }



    public String getStudentName() {
        return studentName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }
}
