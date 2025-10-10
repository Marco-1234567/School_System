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
    protected int getValidInt() {
        String intputString = SCANNER.nextLine().strip();
        int input;
        try {
            input = Integer.parseInt(intputString);
            if (input < 0 || input > StudentManagement.get().getStudents().size()) {
                setError(String.format("%d is either too high or too low!", input));
                input = -1;
            }
        } catch (NumberFormatException e) {
            setError(String.format("Error: \"%s\" is not a number!", intputString));
            input = -1;
        }
        return input;
    }

    @Override
    protected void drawOptions() {
        int n = 1;
        for (var student : StudentManagement.get().getStudents()) {
            System.out.printf(
                "%d.\t%s %s%n",
                n++,
                student.getFirstName(),
                student.getLastName()
            );
        }
    }

    @Override
    protected void drawPrompt(String prompt) {
        System.out.print("Remove Student #: ");
    }

    @Override
    public void update(Stack<Menu> menuStack) {
        draw();
        int studentNumber = getValidInt();

        switch (studentNumber) {
            case -1:
                return;
            case 0:
                menuStack.pop();
                break;
            default:
                StudentManagement.get().removeStudent(studentNumber - 1);
        }
    }
}
