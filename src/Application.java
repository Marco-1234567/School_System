import Persons.Student;
import Persons.StudentManagement;

public class Application {

    private static Application instance;

    private Application() {
    }

    public static Application getInstance(){

        if (instance == null){
          instance = new Application();
        }

        return instance;

    }

    public  void run(){

        // todo bla bla Student testing

        StudentManagement sManager = new StudentManagement();

        System.out.println("\nStudent list at start:");
        sManager.PrintListStudents();

        sManager.addStudent( new Student("David", "D"));
        System.out.println("\nStudent list after add:");
        sManager.PrintListStudents();

        System.out.println("\nStudent list after remove no 3:");
        sManager.removeStudent(2);  // Obs: [0-n]
        sManager.PrintListStudents();



        //-----to here -------------------------
    }
}
