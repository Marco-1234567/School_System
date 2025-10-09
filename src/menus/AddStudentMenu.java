package menus;

import Persons.Student;
import Persons.StudentManagement;

import java.util.Stack;

public class AddStudentMenu extends Menu {
    private static final AddStudentMenu INSTANCE = new AddStudentMenu("Add Student");
    private AddStudentMenu(String title) {
        super(title, null);
    }

    public static AddStudentMenu get() {
        return INSTANCE;
    }

    @Override
    public void update(Stack<Menu> menuStack) {
        draw();
        System.out.print("First name: ");
        String firstName = SCANNER.nextLine();
        System.out.print("Last name: ");
        String lastName = SCANNER.nextLine();

        StudentManagement.get().addStudent(new Student(firstName, lastName));
        menuStack.pop();
    }
}
