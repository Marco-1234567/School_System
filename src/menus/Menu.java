package menus;

public class Menu {
    private final String title;
    private final Menu[] options;

    protected Menu(String title, Menu[] options) {
        this.title = title;
        this.options = options;
    }

    public String title() {
        return title;
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public void drawTitle() {
        System.out.printf(
            "%n╚══════╗ %s ╔══════╝%n",
            this.title
        );
    }

    public void drawOptions() {
        int n = 0;
        for (var option : options) {
            System.out.printf(
                "%d.\t%s%n",
                ++n,
                option.title()
            );
        }
    }

    public void draw() {
        clearScreen();
        drawTitle();
        drawOptions();
    }
}
