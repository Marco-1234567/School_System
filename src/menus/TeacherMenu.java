package menus;

import menus.teacher.AddTeacherMenu;
import menus.teacher.ListTeachersMenu;

public class TeacherMenu extends Menu {
    private static final TeacherMenu INSTANCE = new TeacherMenu("Teachers");
    private TeacherMenu(String title) {
        super(title,
                new Menu[]
                {
                        AddTeacherMenu.get(),
                        ListTeachersMenu.get()
                });
    }

    public static TeacherMenu get() {
        return INSTANCE;
    }
}
