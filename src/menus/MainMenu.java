package menus;

public class MainMenu extends Menu {
    private static final MainMenu INSTANCE = new MainMenu("School System Menu");
    private MainMenu(String title) {
        super(
            title,
            new Menu[] {
                StudentMenu.get(),
                CoursesMenu.get(),
                TeacherMenu.get()
            }
        );
    }

    public static MainMenu get() {
        return INSTANCE;
    }

    @Override
    protected void drawOptions() {
        super.drawOptions();
        System.out.printf("0. Exit%n");
    }
}
