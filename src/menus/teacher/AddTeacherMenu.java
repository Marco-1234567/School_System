package menus.teacher;
import Persons.Teacher;
import Persons.TeacherManagement;
import menus.AddStudentMenu;
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

    public void update(Stack<Menu> menuStack) {
        draw();
        System.out.println("First name: ");
        String firstName = SCANNER.nextLine();
        System.out.println("Last name: ");
        String lastName = SCANNER.nextLine();

        TeacherManagement.get().addTeacher(new Teacher(firstName, lastName));
        menuStack.pop();

    }
}
