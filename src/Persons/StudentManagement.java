package Persons;

import data.TestData;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    private static final StudentManagement INSTANCE = new StudentManagement(TestData.get().getStudentsData());
    private List<Student> students = new ArrayList<>();

    public static StudentManagement get() {
        return INSTANCE;
    }

    public StudentManagement(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){

        this.students.add(student);
    }

    public void removeStudent(int index){

        this.students.remove(index);
    }

    public void PrintListStudents(){

        for (int i = 0; i < students.size(); i++) {
            System.out.printf("%d. Student name: %s %s%n", i + 1, students.get(i).getFirstName(), students.get(i).getLastName());
        }
    }
}
