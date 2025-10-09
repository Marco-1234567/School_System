import java.util.Scanner;
import course.CourseDefinition;
import course.CourseDefinitionManager;
import course.ActiveCourse;
import course.ActiveCourseManager;
import Persons.Student;
import Persons.StudentManagement;
import grade.Grade;
import grade.GradeScheme;
import grade.GradeSystem;
import grade.LetterGradeScheme;
import menus.MainMenu;

public class Application {

    private static Application instance;
    TestData td = new TestData();
    private final Scanner sc = new Scanner(System.in);
    private final CourseDefinitionManager courseMgr = new CourseDefinitionManager();
    private final ActiveCourseManager activeMgr = new ActiveCourseManager(td.getActiveCourses());

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


        //Courses
        // TestData
        for (CourseDefinition cd : td.getCourseCatalogueData()) {
            courseMgr.addCourseDefinition(cd);
        }

        //Visa kurskatalogen
        courseMgr.printListCourseDefinitions();

        // Ta bort nr 2 (index 1) och visa igen
        courseMgr.removeCourseDefinition(1);
        courseMgr.printListCourseDefinitions();

        // Visa aktiva kurser
        activeMgr.printListActiveCourses();





        // lägg till
        //CourseDefinitionManager courseDefinitionManager = new CourseDefinitionManager();

        //Se
        //courseDefinitionManager.printListCourseDefinitions();

        // ta bort index baserad
        //courseDefinitionManager.removeCourseDefinition(1);
        //courseDefinitionManager.printListCourseDefinitions();

        // Visa CourseDefinitions
        //courseMgr.printListCourseDefinitions();

        //Active course
        //for (CourseDefinition cd : td.getCourseCatalogueData()) {
//            courseMgr.addCourseDefinition(cd);
//        }
//        ActiveCourseManager activeCourseManager = new ActiveCourseManager(td.getActiveCourses());
//        ActiveCourseManager aManager = new ActiveCourseManager(td.getActiveCourses());
        //testdata
//        int num = 1;
//        String start = "2025-08-20";
//        String end = "2025-12-15";
//        int limit = 30;
//        String scheme = "LETTER";
        // Skapa och lägg till ActiveCourse direkt från CourseDefinition-valet
        //ActiveCourse ac = activeCourseManager.addFromSelection(num, courseDefinitionManager, start, end, limit, scheme);

        //if (ac == null) {
//            System.out.println("Ogiltigt nummer – ingen kurs skapad.");
//        } else {
//            System.out.println("Invalid selection — no course created: " + ac.getActiveCourseId());
//        }

        // todo bla bla Student testing


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
        int gradeScore = 56;
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
                ActiveCourse.Status.ACTIVE,
                GradeSystem.LETTER
        );
        Enrollment enrollment1 = new Enrollment(student,  programming1, enrollmentDate, gradeScore);
        System.out.println("Enrollment 1: "+ enrollment1.toString());

        //_____Enrollment End___//
    }
}
