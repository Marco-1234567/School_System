package menus;

public class CoursesMenu extends Menu {
    private static final CoursesMenu INSTANCE = new CoursesMenu("Courses");
    private CoursesMenu(String title) {
        super(title, null);
    }

    public static CoursesMenu get() {
        return INSTANCE;
    }
}
