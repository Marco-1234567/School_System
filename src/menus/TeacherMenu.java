package menus;

public class TeacherMenu extends Menu {
    private static final TeacherMenu INSTANCE = new TeacherMenu("Teachers");
    private TeacherMenu(String title) {
        super(title, null);
    }

    public static TeacherMenu get() {
        return INSTANCE;
    }
}
