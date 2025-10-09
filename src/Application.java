import java.util.Stack;
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
import menus.*;

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
                ActiveCourse.Status.ACTIVE,
                GradeSystem.LETTER
        );
        Enrollment enrollment1 = new Enrollment(student, grade, programming1, enrollmentDate);
        System.out.println("Enrollment 1: "+ enrollment1.toString());

        //_____Enrollment End___//

        //----Sebastian's menu =BEGIN---------
        // Initialize menu stack
        // push MainMenu to menu stack
        //DO==
        // peek the menu stack
        // update
        // - draw
        // -- clear screen
        // -- draw menu title
        // -- draw menu options
        // - get input from scanner
        // - validate input
        //-------- menu dependant --------
        // - switch on input
        // -- 0. (back/exit) { pop the menu stack }
        // -- 1. Students { push StudentMenu to menu stack } // these three are only true in MainMenu!
        // -- 2. Courses { push CoursesMenu to menu stack }
        // -- 3. Teachers { push TeacherMenu to menu stack } // impossible to do from within TeacherMenu, no access to menu stack!
        //-------- menu dependant --------
        //==WHILE menu stack not empty
        // menu dependants should be implemented in each menu subclass... but how do they get access to the menu stack? parameter?
        // yes, first attempt at implementing the above
        Stack<Menu> menuStack = new Stack<>();
        menuStack.push(MainMenu.get());
        while(!menuStack.isEmpty()) {
            menuStack.peek().update(menuStack);
        }
        //----Sebastian's menu =END-----------
    }
}
