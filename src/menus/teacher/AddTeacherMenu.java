package menus.teacher;
import Persons.Teacher;
import Persons.TeacherManagement;
import menus.Menu;
import java.util.Stack;

public class AddTeacherMenu extends Menu {
    private static final AddTeacherMenu INSTANCE = new AddTeacherMenu("Add teacher");
    private AddTeacherMenu(String title) {
        super(title, null);
    }

    public static AddTeacherMenu get() {
        return INSTANCE;
    }

    @Override
    protected void draw() {
        clearScreen();
        drawTitle();
        dumpError();
    }

    @Override
    public void update(Stack<Menu> menuStack) {
        draw();
        drawPrompt("First name: ");
        String firstName = getValidString();
        if (firstName.isBlank()) {
            setError("Error: First name cannot be empty!");
            return;
        }
        drawPrompt("Last name: ");
        String lastName = getValidString();

        TeacherManagement.get().addTeacher(new Teacher(firstName, lastName));
        menuStack.pop();
    }
}
