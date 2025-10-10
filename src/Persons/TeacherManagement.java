package Persons;
import Persons.Teacher;
import data.TestData;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {
    private static final TeacherManagement INSTANCE = new TeacherManagement(TestData.get().getTeachersData());
    private List<Teacher> teachers = new ArrayList<>();

    public static TeacherManagement get() {
        return INSTANCE;
    }
    public TeacherManagement(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }
    public void removeTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }

    public void PrintListTeachers() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.printf("%d. Teacher name: %s %s%n", i + 1, teachers.get(i).getFirstName(), teachers.get(i).getLastName());
        }
    }


}
