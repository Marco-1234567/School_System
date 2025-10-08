import java.util.Scanner;
import course.CourseDefinition;
import course.CourseDefinitionManager;
import course.ActiveCourse;
import course.ActiveCourseManager;
import Persons.Student;
import Persons.StudentManagement;
import menus.MainMenu;

public class Application {

    private static Application instance;

    private final Scanner sc = new Scanner(System.in);
    private final CourseDefinitionManager courseMgr = new CourseDefinitionManager();
    private final ActiveCourseManager activeMgr = new ActiveCourseManager();

    private Application() {
    }

    public static Application getInstance(){

        if (instance == null){
          instance = new Application();
        }

        return instance;
    }

    public  void run() {

        // todo bla bla


        //Course defefinition
        // lägg till
        CourseDefinitionManager courseDefinitionManager = new CourseDefinitionManager();
        courseDefinitionManager.addCourseDefinition(new CourseDefinition("MA1001", "Matematik 1", "", 100f, "Matematik", "Gymnasie"));
        courseDefinitionManager.addCourseDefinition(new CourseDefinition("SV3", "Svenska 3", "", 100f, "Svenska", "Gymnasie"));

        //Se
        courseDefinitionManager.printListCourseDefinitions();

        // ta bort index baserad
        courseDefinitionManager.removeCourseDefinition(1);
        courseDefinitionManager.printListCourseDefinitions();

        // Visa CourseDefinitions
        courseDefinitionManager.printListCourseDefinitions();

        //Active course
        ActiveCourseManager activeCourseManager = new ActiveCourseManager();
        //testdata
        int num = 1;
        String start = "2025-08-20";
        String end = "2025-12-15";
        int limit = 30;
        String scheme = "LETTER";
        // Skapa och lägg till ActiveCourse direkt från CourseDefinition-valet
        ActiveCourse ac = activeCourseManager.addFromSelection(num, courseDefinitionManager, start, end, limit, scheme);

        if (ac == null) {
            System.out.println("Ogiltigt nummer – ingen kurs skapad.");
        } else {
            System.out.println("Invalid selection — no course created: " + ac.getActiveCourseId());
        }

        //----Sebastian's menu =BEGIN---------
        MainMenu.getInstance().draw();
        //----Sebastian's menu =END-----------
        // todo bla bla Student testing
        StudentManagement sManager = new StudentManagement();
        TestData td = new TestData();
        StudentManagement sManager = new StudentManagement(td.getStudentsData());

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
