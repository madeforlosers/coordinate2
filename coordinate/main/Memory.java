package coordinate.main;

/*  
 *  COORDINATE LANGUAGE
 *  by madeforlosers 2026
 *  
 *  Memory.java
 *      Container for Memory
*/

public class Memory {
    public final Tape tape;
    public final InputHandler input;

    public Memory() {
        this.tape = new Tape();
        this.input = new InputHandler();
    }
}