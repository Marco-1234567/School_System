package menus;

import java.util.Scanner;
import java.util.Stack;

abstract public class Menu {
    protected static final Scanner SCANNER = new Scanner(System.in);

    private final String title;
    private final Menu[] options;

    protected Menu(String title, Menu[] options) {
        this.title = title;
        this.options = options;
    }

    protected String title() {
        return title;
    }

    protected void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

    protected void drawTitle() {
        System.out.printf(
            "%n╚══════╗ %s ╔══════╝%n",
            this.title
        );
    }

    protected void drawOptions() {
        if (this.options == null) {
            return;
        }
        int n = 0;
        for (var option : this.options) {
            if (option == null) {
                continue;
            }
            System.out.printf(
                "%d.\t%s%n",
                ++n,
                option.title()
            );
        }
    }

    protected Menu[] getOptions() {
        return this.options;
    }

    protected void draw() {
        clearScreen();
        drawTitle();
        drawOptions();
    }

    public void update(Stack<Menu> menuStack) {
        this.draw();
        int input = Integer.parseInt(SCANNER.nextLine().strip());
        // invalid input
        if (input < 0 || input > this.options.length) {
            return;
        }
        // back/exit
        if (input == 0) {
            menuStack.pop();
        } else {
            menuStack.push(this.getOptions()[input - 1]);
        }
    }
}
