package menus;

public class StudentMenu extends Menu {
    private static final StudentMenu INSTANCE = new StudentMenu("Students");
    private StudentMenu(String title) {
        super(
            title,
            new Menu[] {
                AddStudentMenu.get(),
                ListStudentsMenu.get()
            }
        );
    }

    public static StudentMenu get() {
        return INSTANCE;
    }

    @Override
    protected void drawOptions() {
        super.drawOptions();
        System.out.printf("0. Back%n");
    }
}
