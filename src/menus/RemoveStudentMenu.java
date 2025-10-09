package menus;

import Persons.StudentManagement;

import java.util.Stack;

public class RemoveStudentMenu extends Menu {

    private static final RemoveStudentMenu INSTANCE = new RemoveStudentMenu("Remove Student");

    private RemoveStudentMenu(String title) {
        super(title, null);
    }

    public static RemoveStudentMenu get(){
        return INSTANCE;
    }

    @Override
    public void update(Stack<Menu> menuStack) {
        draw();
        System.out.println("\nList of students");
        StudentManagement.get().PrintListStudents();
        System.out.print("Remove student att index: ");
        int index = SCANNER.nextInt();
        SCANNER.nextLine();

        StudentManagement.get().removeStudent(index - 1);

        System.out.println("\nList of students");
        StudentManagement.get().PrintListStudents();
        menuStack.pop();
    }
}
