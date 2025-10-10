package Persons;

import data.TestData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManagement {
    private static final StudentManagement INSTANCE = new StudentManagement(TestData.get().getStudentsData());
    private final List<Student> students;

    public static StudentManagement get() {
        return INSTANCE;
    }

    private StudentManagement(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){

        this.students.add(student);
    }

    public void removeStudent(int index){

        this.students.remove(index);
    }

    public final List<Student> getStudents(){

        return Collections.unmodifiableList(students);
    }
}
