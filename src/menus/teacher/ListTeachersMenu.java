package menus.teacher;

import Persons.StudentManagement;
import Persons.TeacherManagement;
import menus.ListStudentsMenu;
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
    public void update(Stack<Menu> menuStack) {
        draw();
        TeacherManagement.get().PrintListTeachers();
        System.out.printf("0. Back%n");

        if (SCANNER.nextLine().strip().equals("0")) {
            menuStack.pop();
        }
    }
}
