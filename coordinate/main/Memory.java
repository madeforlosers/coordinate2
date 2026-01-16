package coordinate.main;

public class Memory {
    public final Tape tape;
    public final InputHandler input;

    public Memory() {
        this.tape = new Tape();
        this.input = new InputHandler();
    }
}