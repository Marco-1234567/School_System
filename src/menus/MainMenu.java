package menus;

import java.util.Scanner;

public class MainMenu extends Menu {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final MainMenu INSTANCE = new MainMenu("School System Menu");;
    private MainMenu(String title) {
        super(
            title,
            new Menu[] {
                new StudentMenu("Students"),
                new TeacherMenu("Teachers"),
                new CoursesMenu("Courses")
            }
        );
    }

    public static MainMenu getInstance() {
        return INSTANCE;
    }
}
