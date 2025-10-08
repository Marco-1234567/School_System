import java.util.Scanner;
import course.CourseDefinition;
import course.CourseDefinitionManager;
import course.ActiveCourse;
import course.ActiveCourseManager;
import Persons.Student;
import Persons.StudentManagement;
import grade.Grade;
import grade.GradeScheme;
import grade.LetterGradeScheme;
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
        GradeScheme scheme = new LetterGradeScheme();
        // Skapa och lägg till ActiveCourse direkt från CourseDefinition-valet
        ActiveCourse ac = activeCourseManager.addFromSelection(num, courseDefinitionManager, start, end, limit, scheme);

        if (ac == null) {
            System.out.println("Ogiltigt nummer – ingen kurs skapad.");
        } else {
            System.out.println("Invalid selection — no course created: " + ac.getActiveCourseId());
        }

        // todo bla bla Student testing

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

        //----Sebastian's menu =BEGIN---------
        MainMenu.getInstance().draw();
        //----Sebastian's menu =END-----------

        //------Enrollment_____//
       Student student = new Student("David", "D");
      GradeScheme scheme2 = new LetterGradeScheme();
        int score = 56;
        Grade grade = scheme2.evaluateGrade(score);
        String enrollmentDate = "2025-08-20";
        ActiveCourse programming1 = new ActiveCourse(
                "CS101",
                "Programmering 1",
                "Introduktion till Java",
                7.5f,
                "Computer Science",
                "Beginner",
                "2025-08-20",
                "2025-12-15",
                30,
                scheme2,
                ActiveCourse.Status.ACTIVE
        );
        Enrollment enrollment1 = new Enrollment(student, grade, programming1, enrollmentDate);
        System.out.println("Enrollment 1: "+ enrollment1.toString());

        //_____Enrollment End___//
    }
}
