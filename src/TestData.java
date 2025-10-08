import Persons.Student;
import Persons.Teacher;
import java.util.ArrayList;
import java.util.List;

public class TestData {

    private ArrayList<Student> studentsData = new ArrayList<>( List.of(
            new Student("Adam", "Andersson"),
            new Student("Bertil", "Bengtsson"),
            new Student("Cesar", "Carlsson")
    ) );

    private ArrayList<Teacher> teachersData = new ArrayList<>( List.of(
            new Teacher("Amanda", "Adamsson"),
            new Teacher("Berit", "Bertilsson"),
            new Teacher("Camilla", "Carlström")
    ) );

// TODO   private List<Person> courses = new ArrayList<>( List.of(
//            new ActiveCourse(),
//    ) );

    public TestData(){};

    public ArrayList<Student> getStudentsData() {
        return studentsData;
    }

    public ArrayList<Teacher> getTeachersData() {
        return teachersData;
    }
}
