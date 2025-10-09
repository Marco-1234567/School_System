package menus;

public class StudentMenu extends Menu {
    private static final StudentMenu INSTANCE = new StudentMenu("Students");
    private StudentMenu(String title) {
        super(
            title,
            new Menu[] {
                AddStudentMenu.get(),
                ListStudentsMenu.get(),
                RemoveStudentMenu.get()
            }
        );
    }

    public static StudentMenu get() {
        return INSTANCE;
    }
}
