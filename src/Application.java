import java.util.Stack;

import course.CourseDefinition;
import course.CourseDefinitionManager;
import course.ActiveCourse;
import course.ActiveCourseManager;
import Persons.Student;
import Persons.StudentManagement;
import menus.*;

public class Application {

    private static Application instance;

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
