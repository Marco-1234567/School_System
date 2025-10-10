package menus.teacher;

import Persons.TeacherManagement;
import menus.Menu;
import java.util.Stack;

public class RemoveTeacherMenu extends Menu {
    private static final RemoveTeacherMenu INSTANCE = new RemoveTeacherMenu("Remove Teacher");
    private RemoveTeacherMenu(String title) {
        super(title, null);
    }

    public static RemoveTeacherMenu get(){
        return INSTANCE;
    }

    @Override
    protected int getValidInt() {
        String intputString = SCANNER.nextLine().strip();
        int input;
        try {
            input = Integer.parseInt(intputString);
            if (input < 0 || input > TeacherManagement.get().getTeachers().size()) {
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
        for (var teacher : TeacherManagement.get().getTeachers()) {
            System.out.printf(
                    "%d.\t%s %s%n",
                    n++,
                    teacher.getFirstName(),
                    teacher.getLastName()
            );
        }
    }

    @Override
    protected void drawPrompt(String prompt) {
        System.out.print("Remove Teacher #: ");
    }

    @Override
    public void update(Stack<Menu> menuStack) {
        draw();
        int teacherNumber = getValidInt();

        switch (teacherNumber) {
            case -1:
                return;
            case 0:
                menuStack.pop();
                break;
            default:
                TeacherManagement.get().removeTeacher(teacherNumber - 1);
        }
    }
}
