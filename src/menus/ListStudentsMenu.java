package menus;

import Persons.StudentManagement;

import java.util.List;
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
    public void update(Stack<Menu> menuStack) {
        draw();
        StudentManagement.get().PrintListStudents();
        System.out.printf("0. Back%n");

        if (SCANNER.nextLine().strip().equals("0")) {
            menuStack.pop();
        }
    }
}
