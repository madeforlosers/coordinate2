package coordinate.main;

import java.util.Scanner;

/*  
 *  COORDINATE LANGUAGE
 *  by madeforlosers 2026
 *  
 *  InputHandler.java
 *      Handles inputs and stuff.
 * 
 *  TODO:
 *      add more functionality
*/

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