package menus;

import java.util.Scanner;
import java.util.Stack;

abstract public class Menu {
    protected static final Scanner SCANNER = new Scanner(System.in);

    private String error;
    private final String title;
    private final Menu[] options;

    protected Menu(String title, Menu[] options) {
        this.error = "";
        this.title = title;
        this.options = options == null ? new Menu[0] : options;
    }

    protected String getValidString() {
        return SCANNER.nextLine().strip();
    }

    protected int getValidInt() {
        String inputString = SCANNER.nextLine().strip();
        int input;
        try {
            input = Integer.parseInt(inputString);
            // 0 is always a valid input
            if (input == 0) {
                return input;
            }
            // otherwise, if the menu is empty...
            if (this.options.length == 0) {
                this.error = "No menu options available, go back(0).";
                input = -1;
                // ...or if the input is out-of-range...
            } else if (input < 0 || input > this.options.length) {
                throw new RuntimeException(String.format("Error: %d is not among the available options(0-%d)!", input, this.options.length));
            }
            // set the error message to be displayed in the next rendering of the menu, and set the return value to -1 signaling to the program
            // that it should not continue using this input and return(going back to the menu loop in Application)
        } catch (NumberFormatException e) {
            this.error = String.format("Error: %s is not a number!", inputString.isEmpty() ? "Input" : inputString);
            input = -1;
        } catch (RuntimeException e) {
            this.error = e.getMessage();
            input = -1;
        }
        return input;
    }

    protected String title() {
        return title;
    }

    protected void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    protected void drawTitle() {
        System.out.printf(
            "%n╚══════╗ %s ╔══════╝%n",
            this.title
        );
    }

    protected void drawOptions() {
        for (int i = 0; i < this.options.length; i++) {
            System.out.printf(
                "%d.\t%s%n",
                i + 1,
                options[i].title()
            );
        }
    }

    protected void drawFinalOption(String finalOption) {
        System.out.printf("0. %s%n", finalOption);
    }

    protected Menu[] getOptions() {
        return this.options;
    }

    protected void dumpError() {
        System.out.printf("%s%n", this.error);
        this.error = "";
    }

    protected void setError(String errorString) {
        this.error = errorString;
    }

    protected void drawPrompt() {
        System.out.print("> ");
    }

    protected void draw() {
        clearScreen();
        drawTitle();
        drawOptions();
        drawFinalOption("Back");
        dumpError();
        drawPrompt();
    }

    public void update(Stack<Menu> menuStack) {
        this.draw();
        int input = getValidInt();
        // invalid input
        if (input < 0) {
            return;
        }
        // back/exit
        if (input == 0) {
            menuStack.pop();
        // go to next submenu
        } else {
            menuStack.push(this.getOptions()[input - 1]);
        }
    }
}
