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
    public final Summation summation;
    public final Func function;
    public Memory() {
        this.tape = new Tape();
        this.input = new InputHandler();
        this.summation = new Summation();
        this.function = new Func();
    }
}