package coordinate.main;

import java.util.Scanner;

public class InputHandler {
    private final Scanner input;

    public InputHandler() {
        this.input = new Scanner(System.in);
    }

    public String nextLine() {
        return this.input.nextLine();
    }

    public void close() {
        this.input.close();
    }
}