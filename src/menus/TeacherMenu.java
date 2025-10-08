package menus;

import java.util.Stack;

public class TeacherMenu extends Menu {
    private static final TeacherMenu INSTANCE = new TeacherMenu("Teachers");
    private TeacherMenu(String title) {
        super(title, new Menu[0]);
    }

    public static TeacherMenu get() {
        return INSTANCE;
    }

    @Override
    protected void drawOptions() {
        super.drawOptions();
        System.out.printf("0. Back%n");
    }
}
