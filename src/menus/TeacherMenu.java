package menus;

import menus.teacher.AddTeacherMenu;
import menus.teacher.ListTeachersMenu;
import menus.teacher.RemoveTeacherMenu;

public class TeacherMenu extends Menu {
    private static final TeacherMenu INSTANCE = new TeacherMenu("Teachers");
    private TeacherMenu(String title) {
        super(
            title,
            new Menu[] {
                AddTeacherMenu.get(),
                RemoveTeacherMenu.get(),
                ListTeachersMenu.get(),
            }
        );
    }

    public static TeacherMenu get() {
        return INSTANCE;
    }
}
