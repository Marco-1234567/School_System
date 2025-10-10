package Persons;

import data.TestData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeacherManagement {
    private static final TeacherManagement INSTANCE = new TeacherManagement(TestData.get().getTeachersData());
    private final List<Teacher> teachers;

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

    public final List<Teacher> getTeachers() {
        return Collections.unmodifiableList(teachers);
    }


}
