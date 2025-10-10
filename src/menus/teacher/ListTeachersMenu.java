package menus.teacher;

import Persons.TeacherManagement;
import menus.Menu;
import java.util.Stack;

public class ListTeachersMenu extends Menu{
    private static final ListTeachersMenu INSTANCE = new ListTeachersMenu("List Teachers");
    private ListTeachersMenu(String title) {
        super(title, null);
    }

    public static ListTeachersMenu get() {
        return INSTANCE;
    }

    @Override
    protected void drawOptions() {
        for (var teacher : TeacherManagement.get().getTeachers()) {
            System.out.printf(
                "\t%s %s%n",
                teacher.getFirstName(),
                teacher.getLastName()
            );
        }
    }

    @Override
    public void update(Stack<Menu> menuStack) {
        draw();
        if (getValidInt() == 0) {
            menuStack.pop();
        }
    }
}
