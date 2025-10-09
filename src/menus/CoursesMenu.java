package menus;

public class CoursesMenu extends Menu {
    private static final CoursesMenu INSTANCE = new CoursesMenu("Courses");
    private CoursesMenu(String title) {
        super(title, new Menu[0]);
    }

    public static CoursesMenu get() {
        return INSTANCE;
    }

    @Override
    protected void drawOptions() {
        super.drawOptions();
        System.out.printf("0. Back%n");
    }
}
