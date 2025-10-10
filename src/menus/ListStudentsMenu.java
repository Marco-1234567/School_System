package menus;

import Persons.StudentManagement;
import java.util.Stack;

public class ListStudentsMenu extends Menu{
    private static final ListStudentsMenu INSTANCE = new ListStudentsMenu("List Students");
    private ListStudentsMenu(String title) {
        super(title, null);
    }

    public static ListStudentsMenu get() {
        return INSTANCE;
    }

    @Override
    protected void drawOptions() {
        for (var student : StudentManagement.get().getStudents()) {
            System.out.printf(
                "\t%s %s%n",
                student.getFirstName(),
                student.getLastName()
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
