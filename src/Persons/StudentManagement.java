package Persons;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {

    private List<Student> students = new ArrayList<>();

    public StudentManagement() {
        //this.students = students;
        this.students = new ArrayList<>( List.of(
                new Student("Adam", "Andersson"),
                new Student("Bertil", "Bengtsson"),
                new Student("Cesar", "Carlsson")
                ) );
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


    @Override
    public String toString() {
        return "StudentManagement{" +
                "students=" + students +
                '}';
    }
}
