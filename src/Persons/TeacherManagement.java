package Persons;

import java.util.ArrayList;
import java.util.List;

public class TeacherManagement {

    List<Teacher> teachers = new ArrayList<>(List.of(
            new Teacher("Anna", "Holm"),
            new Teacher("Lars", "Ekström"),
            new Teacher("Maja", "Svensson"),
            new Teacher("Oskar", "Nilsson"),
            new Teacher("Emma", "Karlsson"),
            new Teacher("David", "Persson")
    ));

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void deleteTeacher(){
        for (Teacher teacher : teachers){
            if(teacher.getFirstName().equals("Anna") && teacher.getLastName().equals("Holm")){
                teachers.remove(teacher);
            }
        }

    }
    public void printTeachersList(){
        for (Teacher teacher : teachers){
            System.out.println(teacher);
        }
    }
    public void assignTeacherToCourse(){

    }

}
